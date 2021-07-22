INSERT INTO user (email, password)
VALUES
("zeitlin@me.com", "37ee788e94965d8a6f25c06c7a58ae2fcd5be58492de5fb991f093f0056e3eb2"),
("gomor@optonline.net", "6eb47ae08c9b3c5f7a02f0d582909fad5a489d3b6c8643daaad3a697886f339a"),
("iamcal@live.com", "a1d7cc5632a937f4cee76556ff7f09288f874c9d39310f6106ca848c0de45a3c"),
("gavollink@icloud.com", "6afd5c01bd64d70f6e3c2611ca20f1e7101163daa66c479b46d07304c6984add"),
("cameron@yahoo.com", "7c190dfc48865e77df32e18600e61ab940b8baf35d772a719ab78c868de33e87"),
("bowmanbs@yahoo.ca", "6a7ffad41c302af24ade814cb152865222f2555b83bc218ce2a8b87fa8e60ae6"),
("cgcra@yahoo.ca", "24e6512ab7b1e91759a8977ca2d4713aefe94acf029b4dc3bef71e9131eee0bc"),
("crypt@hotmail.com", "77c7e34cd28f5b6de261366073cbdefca0e4f887c528ea9702a09ae153e0e560"),
("mosses@sbcglobal.net", "be247a282693bbfcecfc2782f3f48af3168df580be1460cb2e2863342be63b1e"),
("eimear@hotmail.com", "f2b178de854e9d5f3c69bfbd335c34048ae04c8eee4120714eb8e582eebeae20"),
("natepuri@aol.com", "0fc26c8c277650fb5a1322147b8b4bd6b1a1c119dbb0d5b730f5ccf9004205a7"),
("catalog@aol.com", "854f28fce78dc8f8072a3dc43c19179d3522b59cdb1f8ec730bec89920318659"),
("kronvold@hotmail.com", "b480701ce6de87df0a48292ef7e7183f62a0ac0f6b136165dee21e5d17bc3557");

SELECT * FROM USER;

INSERT INTO task (user_id, subject, content, due_date)
VALUES
(1,'Go on a walk around your neighborhood', ' A walk is a great form of low intensity exercise. It’s not intense enough to leave you sweaty or anything, but it gets your blood moving and your heart rate up a little bit. That little bump in blood flow, plus the fresh air and sunshine that you’re getting, plus the ability to simply explore the area around you and see/greet neighbors makes a short walk around the neighborhood a great little break in the day.', '2021-07-25 23:59:59'),
(1,'Go on a nature walk or hike in a nearby park','Take the walk around your neighborhood a step further and head to a local park to take a nature walk. This combines most of the benefits of walking around your neighborhood with the known calming benefits of being in nature. The practice of “forest bathing” – simply spending time in a forested area – has a number of known short term and long term health benefits.','2021-07-26 13:59:59'),
(2,'Drink a big glass of water','Most of us can afford a little bit of additional hydration throughout the day. Simply drinking a large glass of water can help all of our body’s systems function properly, plus it can help stave off hunger and help us feel more sated. I often genuinely feel better after drinking a glass of water if I haven’t had any water in a while. It seems to awaken me.','2021-07-27 23:59:59'),
(3,'Stretch out your body by stretching your various muscle groups for five or 10 minutes.','Simply stretching out all of your muscles feels incredible. It’s a pretty low intensity thing to do – I often do it while listening to a podcast or audiobook – and it leaves you feeling more flexible and just feeling good all over. I generally follow Bruce Lee’s stretching routine to the best of my ability. I’ve been doing this for several months and have seen gradual improvements in my flexibility, plus it just feels good to do it and it provides a moment of calm in the day. Note that it’s a good idea to warm up a little first before stretching by doing some jogging in place or jumping jacks.','2021-07-28 23:59:59'),
(4,'Clean out the inside of your car.','Over time, most cars collect little pieces of detritus – a wrapper, an empty beverage bottle, a forgotten bag, a receipt, a forgotten folding chair in the trunk, a bit of grass from a hike, some dust on the dashboard, and so on. That little bit of messiness can contribute to a small negative feeling when you get in the car, a feeling that can be easily washed away by spending 15 minutes clearing junk out of your car. Clear everything you can off of the floorboards, give them a quick vacuuming, and wipe down the dashboard and panels to remove fingerprints and dust. This little task can make your car feel fresh and new again and you’ll feel good when you get in there to drive next time.','2021-08-25 23:59:59'),
(4,'Eat something really healthy, like a piece of fruit or a vegetable','Grab a banana or an apple or a stalk of celery and just munch on it. This is a great thing to do in combination with just going outside and sitting down and looking around for a bit. I’ll often grab an apple and just sit on the front step in the sunshine eating it, watching the life around me. Eating a quick healthy snack usually helps you feel better in the moment and fills you up with something truly good for you, which can take the edge off of cravings for lower quality food.','2021-07-25 23:59:59'),
(4,'Document a day in your life (or in the life of someone in your immediate family).','Spend a day in which, every 15 minutes or half an hour or hour, you take a picture of whatever it is you happen to be doing at the moment. You can do this with a loved one, too, if you’re spending the day with that person. You can do a selfie or a picture of your environment or whatever. I do this every once in a while, just fully documenting a day. When I’m done, I’ll stick all of the pictures in a document somewhere and add captions explaining it. It’s enjoyable to put this together because it provides a nice meditation on how I actually spend my time. It’s also really fun to go look at older documents like this. It can turn a completely ordinary day into something surprisingly thoughtful and memorable.','2021-07-25 23:59:59'),
(5,'Fill up a bag of items to give to Goodwill. ','This is a wonderful way to declutter your home quickly and get rid of items that you’re not going to use any more. Just get a big canvas bag and fill it up with items that you don’t use any more that someone else could probably use, then drop off the contents of that bag at Goodwill (or your preferred place to drop off secondhand items) the next time you’re nearby. In one swoop, you’ve cleaned up your living quarters and reduced the amount of stuff you have to maintain and pick up and deal with while also being charitable.','2021-07-25 10:59:59'),
(5,'Read a chapter or a section of a really thoughtful book','Check out a book from the library on a topic that you’ve always been curious about, and then in short bits throughout the day, read a chapter or a section of that book. The goal is to read just a handful of pages so that you’re not reading for an extended period. With a thoughtful book, you’re probably going to have a few new ideas to think over after reading that chapter, so you can let those ideas percolate in your head as you go about your day. It’s a great way to slowly digest and learn a new topic, which is a great way to understand the world a little better.','2021-07-25 23:59:59'),
(5,'Take care of a task that’s nagging you in the back of your mind','We all have lists of undone tasks. Right now, the faucet on the sink in the upstairs bathroom needs replaced, as does an infrequently used light fixture on the main floor, and I’d like to do some rearrangement in one of the other bathrooms, and there are some closets that need rearranging… it’s quite a list! Just choose one of the things on that list and either complete that task or make a serious start on it by ordering the supplies you need or taking some other first step on that project. You’ll feel like you made real progress on things left undone and that will feel quite good indeed.','2021-07-25 13:59:59');


INSERT INTO task (user_id, subject, content,priority, due_date)
VALUES
(6,'Go through your print photos and digitize and organize them.','This is a great ongoing project if you have a large collection of photo prints just sitting in a box or an old photo album. Start digitizing them now before they degrade too much and then you can make prints whenever you like, plus you can use those old photos for digital picture frames and screensavers and other tasks. All you really need is a flatbed scanner, which is inexpensive these days, and some time. This is a project that you can do in ten minute chunks over a long period of time – just leave out a box of photos near the scanner and spend a few minutes scanning a few pictures here and there and saving them to your photo archives.','Low','2021-07-28 14:59:59'),
(6,'Fill up your backpack or a basket and go on a picnic.','This is a great way to turn that walk around the neighborhood or that walk in the park into a longer adventure without breaking up your day. Just fill up a backpack or a picnic basket with the items you’d need for a picnic lunch and take it with you on a walk. Find a comfortable place to sit and spread out, then enjoy a meal in a natural setting. Better yet – don’t bring any distractions along with you. Leave your cell phone at home or in the car and just enjoy the environment. You’ll end up feeling subtly relaxed and walk away feeling much better about the state of things in your life.','High','2021-07-28 14:59:59');


SELECT * FROM task;

SELECT subject, content,priority, due_date
FROM task
INNER JOIN user ON user.id = task.user_id
WHERE user_id = 6
ORDER BY due_date ASC,priority DESC
LIMIT 0, 10;


DELETE FROM task WHERE id = 1;