package com.example.sayehwebservices.Utils;

public  class PersianFaker {


    /**
     * fake city Name  like = شهاب
     * @return
     */
    public static String getName() {
        int random = randomNumber(FakeValues.names.length - 1);
        return FakeValues.names[random];
    }

    /**
     * fake city ّFamily  like = سلامی
     * @return
     */
    public static String getFamily() {
        int random = randomNumber(FakeValues.family.length - 1);
        return FakeValues.family[random];
    }

    public static String getFullname() {
        return getName() + " " + getFamily();
    }

    /**
     * fake city name like = نیشابور
     * @return
     */
    public static String getCity() {
        int random = randomNumber(FakeValues.cities.length - 1);
        return FakeValues.cities[random];
    }

    /**
     * fake company name like = پگاه;
     * @return
     */
    public static String getCompany() {
        int random = randomNumber(FakeValues.companies.length - 1);
        return FakeValues.companies[random];
    }

    /**
     * fack addess like =  نیشابور - بلوار خیام ،خیابان عطار
     * @return
     */
    public static String getAddress() {
        int random = randomNumber(FakeValues.address.length - 1);
        return FakeValues.address[random];
    }

    /**
     * fake Number like = 09123456789
     * @return
     */
    public static String getNumber() {
        int random = randomNumber(FakeValues.number.length - 1);
        String number = "0" + FakeValues.number[random];
        return number + randomWithRange(1000000, 9999999);
    }

    private static int randomNumber(int max) {
        int range = (max) + 1;
        return (int) (Math.random() * range);

    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    static class FakeValues {

        private static String[] email = new String[]{
                "gmail.com", "mail.com", "yahoo.com", "outlook.com"

        };
        private static int[] number = new int[]{
                912, 931, 932, 933, 901, 921, 919, 912, 913, 917,
                915, 916, 910, 939, 938, 937, 918, 914, 911, 934
        };
        private static String[] address = new String[]{
                "میدان ونک، بزرگراه حقانی، نرسیده به جهان‌کودک، پ. ۶۳، ط. ۴",
                "تهران ، خيابان گاندي ، خيابان پانزدهم ، پلاک 2",
                "تهران ، خيابان انقلاب ، پلاک 832",
                "تهران ، خيابان استاد نجات الهی ، کوچه شهید محمدی ، پلاک 4",
                "اراک خيابان شهيد بهشتي دانشگاه اراک",
                "خراسان رضوى مشهد قاسم آباد بلوار ميثاق  ميثاق 20 خسروي يك",
                "بزرگراه شهید بابایی (غرب به شرق)، روبروی دانشگاه امام حسین (ع)، خروجی حکیمیه، خیابان شهید صدوقی، روبروی ضلع جنوبی شهرک شهید بهشتی خیابان چمن آرا، پردیس واحد دانشگاهی واحد تهران شمال",
                "خیابان آزادی ،نبش خیابان رودکی",
                "بزرگراه همت ،شرق به غرب ،ابتدای جنت آبادشمالی ،کوچه دانش",
                "میدان بسیج ،ابتدای خیابان ابوذر ،جنب شهرداری منطقه 15",
                "شهرکرد ،میدان دفاع مقدس ،جاده رحمتیه ،روبروی ساختمانهای مسکن مهر",
                "تهران خیابان آفریقا،بالاتر از چهار راه جهان کودک ، کوچه شهید صانعی پلاک 15",
                "اردبیل ـ خیابان دانشگاه ـ خیابان 13 آبان ـ پلاک 48",
                "كرج ـ جهانشهر ـ بلوار مولانا ـ بين خيابان كسري شمالي و فرمانداري شمالي ـ قطعه 1397ـ ساختمان نيلوفر",
                "قزوین ـ خيابان فلسطين شرقي ـ نبش خيابان توحيد",
                "تهران سعادت اباد میدان کاج خیابان سرو شرقی نبش خیابان علامه طباطبایی شمالی پلاک ۵"
        };
        private static String[] companies = new String[]{
                "پارس پویا کنترل بینالود", "خاورزمین", "بیمه آسیا", "فولاد هرمزگان جنوب",
                "اسنپ", "تپ سی", "آواتک",
                "بیدینگ", "ایران شرق", "شنبه", "دیجی کالا", "بامیلو", "ایرانسل",
                "همراه اول", "سرآوا پارس", "ایران خودرو", "سایپا", "پارت پلاستیک خراسان", "هومکر", "کاموا",
                "کانگرو", "پالایش نفت تهران", "پتروشیمی مبین", "کاله", "میهن",
                "دمینو", "فضل الکتریک", "خیام الکتریک", "سه گل خراسان", "ضامن پاژ", "فولاد خراسان", "بهمن خودرو", "مرتب خودرو"
        };
        private static String[] cities = new String[]{
                "اردبيل", "اصلاندوز", "آبي بيگلو", "بيله سوار",
                "پارس آباد", "تازه كند", "تازه كندانگوت", "جعفرآباد",
                "خلخال", "رضي", "سرعين", "عنبران", "فخرآباد", "كلور", "كوراييم", "گرمي", "گيوي", "لاهرود", "مرادلو", "مشگين شهر", "نمين", "نير", "هشتجين", "هير", "ابريشم", "ابوزيدآباد", "اردستان", "اژيه", "اصفهان",
                "افوس", "انارك", "ايمانشهر", "آران وبيدگل", "بادرود", "باغ بهادران", "بافران", "برزك", "برف انبار", "بوئين ومياندشت", "بهاران شهر", "بهارستان", "پيربكران", "تودشك", "تيران", "جندق", "جوزدان", "جوشقان وكامو", "چادگان",
                "چرمهين", "چمگردان", "حبيب آباد", "حسن آباد", "حنا", "خالدآباد", "خميني شهر", "خوانسار", "خور", "خوراسگان", "خورزوق", "داران", "دامنه", "درچه پياز", "دستگرد", "دولت آباد", "دهاقان", "دهق",
                "ديزيچه", "رزوه", "رضوانشهر", "زاينده رود", "زرين شهر", "زواره", "زيباشهر", "سده لنجان", "سفيدشهر", "سگزي", "سميرم", "شاپورآباد", "شاهين شهر", "شهرضا", "طالخونچه", "عسگران", "علويچه", "فرخي",
                "فريدونشهر", "فلاورجان", "فولادشهر", "قمصر", "قهجاورستان", "قهدريجان", "كاشان", "كركوند", "كليشادوسودرجان", "كمشچه", "كمه", "كوشك", "كوهپايه", "كهريزسنگ", "گرگاب", "گزبرخوار", "گلپايگان",
                "گلدشت", "گلشن", "گلشهر", "گوگد", "لاي بيد", "مباركه", "محمدآباد", "مشكات", "منظريه", "مهاباد", "ميمه", "نائين", "نجف آباد", "نصرآباد", "نطنز", "نوش آباد",
                "نياسر", "نيك آباد", "ورزنه", "ورنامخواست", "وزوان", "ونك", "هرند", "اشتهارد", "آسارا", "تنكمان", "چهارباغ", "سيف آباد",
                "شهرجديدهشتگرد", "طالقان", "كرج", "كمال شهر", "كوهسار", "گرمدره", "ماهدشت", "محمدشهر", "مشكين دشت", "نظرآباد", "هشتگرد",
                "اركواز", "ايلام", "ايوان", "آبدانان", "آسمان آباد", "بدره", "پهله", "توحيد", "چوار", "دره شهر", "دلگشا",
                "دهلران", "زرنه", "سراب باغ", "سرابله", "صالح آباد", "لومار", "مورموري", "موسيان", "مهران", "ميمه", "اسكو", "اهر", "ايلخچي", "آبش احمد", "آذرشهر", "آقكند", "باسمنج", "بخشايش", "بستان آباد", "بناب", "بناب جديد", "تبريز",
                "ترك", "تركمانچاي", "تسوج", "تيكمه داش", "جلفا", "خاروانا", "خامنه", "خراجو", "خسروشهر", "خمارلو", "خواجه", "دوزدوزان", "زرنق", "زنوز", "سراب", "سردرود", "سيس", "سيه رود", "شبستر", "شربيان", "شرفخانه",
                "شندآباد", "شهرجديدسهند", "صوفيان", "عجب شير", "قره آغاج", "كشكسراي", "كلوانق", "كليبر", "كوزه كنان", "گوگان", "ليلان", "مراغه", "مرند", "ملكان", "ممقان", "مهربان", "ميانه", "نظركهريزي", "وايقان", "ورزقان",
                "هاديشهر", "هريس", "هشترود", "هوراند", "يامچي", "اروميه", "اشنويه", "ايواوغلي", "آواجيق", "باروق", "بازرگان", "بوكان", "پلدشت", "پيرانشهر", "تازه شهر", "تكاب", "چهاربرج", "خليفان", "خوي",
                "ديزج ديز", "ربط", "سردشت", "سرو", "سلماس", "سيلوانه", "سيمينه", "سيه چشمه", "شاهين دژ", "شوط", "فيرورق", "قره ضياءالدين", "قطور", "قوشچي", "كشاورز", "گردكشانه", "ماكو",
                "محمديار", "محمودآباد", "مهاباد", "مياندوآب", "ميرآباد", "نالوس", "نقده", "نوشين", "امام حسن", "انارستان", "اهرم", "آبپخش", "آبدان", "برازجان", "بردخون", "بردستان", "بندردير",
                "بندرديلم", "بندرريگ", "بندركنگان", "بندرگناوه", "بنك", "بوشهر", "تنگ ارم", "جم", "چغادك", "خارك", "خورموج", "دالكي", "دلوار", "ريز", "سعدآباد", "سيراف", "شبانكاره",
                "شنبه", "عسلويه", "كاكي", "كلمه", "نخل تقي", "وحدتيه", "ارجمند", "اسلامشهر", "انديشه", "آبسرد", "آبعلي", "باغستان", "باقرشهر", "بومهن", "پاكدشت", "پرديس",
                "پيشوا", "تجريش", "تهران", "جوادآباد", "چهاردانگه", "حسن آباد", "دماوند", "رباط كريم", "رودهن", "ري", "شاهدشهر", "شريف آباد", "شهريار", "صالح آباد", "صباشهر",
                "صفادشت", "فردوسيه", "فرون آباد", "فشم", "فيروزكوه", "قدس", "قرچك", "كهريزك", "كيلان", "گلستان", "لواسان", "ملارد", "نسيم شهر", "نصيرآباد",
                "وحيديه", "ورامين", "اردل", "آلوني", "باباحيدر", "بروجن", "بلداجي", "بن", "جونقان", "چلگرد", "سامان", "سفيددشت",
                "سودجان", "سورشجان", "شلمزار", "شهركرد", "طاقانك", "فارسان", "فرادنبه", "فرخ شهر", "كيان", "گندمان", "گهرو",
                "لردگان", "مال خليفه", "ناغان", "نافچ", "نقنه", "هفشجان", "ارسك", "اسديه", "اسفدن", "اسلاميه", "آرين شهر", "آيسك", "بشرويه",
                "بيرجند", "حاجي آباد", "خضري دشت بياض", "خوسف", "زهان", "سرايان", "سربيشه", "سه قلعه", "شوسف", "طبس مسينا", "فردوس", "قائن", "قهستان", "گزيك", "محمدشهر", "مود", "نهبندان", "نيمبلوك", "احمدآبادصولت",
                "انابد", "باجگيران", "باخرز", "بار", "بايگ", "بجستان", "بردسكن", "بيدخت", "تايباد", "تربت جام", "تربت حيدريه", "جغتاي", "جنگل",
                "چاپشلو", "چكنه", "چناران", "خرو", "خليل آباد", "خواف", "داورزن", "درگز", "درود", "دولت آباد", "رباط سنگ", "رشتخوار", "رضويه", "روداب", "ريوش", "سبزوار", "سرخس", "سفيدسنگ", "سلامي", "سلطان آباد", "سنگان",
                "شادمهر", "شانديز", "ششتمد", "شهرآباد", "شهرزو", "صالح آباد", "طرقبه", "عشق آباد", "فرهادگرد", "فريمان", "فيروزه", "فيض آباد", "قاسم آباد", "قدمگاه", "قلندرآباد", "قوچان",
                "كاخك", "كاريز", "كاشمر", "كدكن", "كلات", "كندر", "گلمكان", "گناباد", "لطف آباد", "مزدآوند", "مشهد", "مشهدريزه", "ملك آباد", "نشتيفان", "نصرآباد", "نقاب", "نوخندان", "نيشابور", "نيل شهر",
                "همت آباد", "يونسي", "اسفراين", "ايور", "آشخانه", "بجنورد", "پيش قلعه", "تيتكانلو", "جاجرم", "حصارگرمخان", "درق", "راز", "سنخواست", "شوقان", "شيروان", "صفي آباد", "فاروج", "قاضي",
                "گرمه", "لوجلي", "اروندكنار", "الوان", "اميديه", "انديمشك", "اهواز", "ايذه", "آبادان", "آغاجاري", "باغ ملك", "بستان", "بندرامام خميني",
                "بندرماهشهر", "بهبهان", "تركالكي", "جايزان", "جنت مكان", "چغاميش", "چمران", "چوئبده", "حر", "حسينيه", "حمزه", "حميديه", "خرمشهر",
                "دارخوين", "دزآب", "دزفول", "دهدز", "رامشير", "رامهرمز", "رفيع", "زهره", "سالند", "سردشت", "سماله", "سوسنگرد", "شادگان", "شاوور", "شرافت", "شوش",
                "شوشتر", "شيبان", "صالح شهر", "صالح مشطط", "صفي آباد", "صيدون", "قلعه تل", "قلعه خواجه", "گتوند", "گوريه", "لالي", "مسجدسليمان", "مشراگه", "مقاومت", "ملاثاني", "ميانرود",
                "ميداود", "مينوشهر", "ويس", "هفتگل", "هنديجان", "هويزه", "ابهر", "ارمغانخانه", "آب بر", "چورزق", "حلب", "خرمدره", "دندي", "زرين آباد", "زرين رود",
                "زنجان", "سجاس", "سلطانيه", "سهرورد", "صائين قلعه", "قيدار", "گرماب", "ماه نشان", "هيدج", "اميريه", "ايوانكي", "آرادان", "بسطام",
                "بيارجمند", "دامغان", "درجزين", "ديباج", "سرخه", "سمنان", "شاهرود", "شهميرزاد", "كلاته خيج", "گرمسار", "مجن", "مهدي شهر",
                "ميامي", "اديمي", "اسپكه", "ايرانشهر", "بزمان", "بمپور", "بنت", "بنجار", "پيشين", "جالق", "چاه بهار",
                "خاش", "دوست محمد", "راسك", "زابل", "زابلي", "زاهدان", "زرآباد", "زهك", "سراوان", "سرباز", "سوران", "سيركان", "علي اكبر", "فنوج", "قصرقند", "كنارك", "گشت", "گلمورتي", "محمدان", "محمدآباد",
                "محمدي", "ميرجاوه", "نصرت آباد", "نگور", "نوك آباد", "نيك شهر", "هيدوج", "اردكان", "ارسنجان", "استهبان", "اسير", "اشكنان", "افزر", "اقليد", "امام شهر", "اوز", "اهل", "ايج", "ايزدخواست", "آباده", "آباده طشك", "باب انار", "بالاده",
                "بنارويه", "بوانات", "بهمن", "بيرم", "بيضا", "جنت شهر", "جويم", "جهرم", "حاجي آباد", "حسامي", "حسن آباد", "خانه زنيان", "خاوران", "خرامه", "خشت", "خنج", "خور", "خومه زار", "داراب", "داريان",
                "دبيران", "دژكرد", "دوبرجي", "دوزه", "دهرم", "رامجرد", "رونيز", "زاهدشهر", "زرقان", "سده", "سروستان", "سعادت شهر", "سورمق", "سيدان",
                "ششده", "شهر جديد صدرا", "شهرپير", "شيراز", "صغاد", "صفاشهر", "علامرودشت", "عمادده", "فدامي", "فراشبند", "فسا", "فيروزآباد", "قادرآباد", "قائميه", "قطب آباد", "قطرويه", "قير", "كارزين", "كازرون",
                "كامفيروز", "كره اي", "كنارتخته", "كوار", "كوهنجان", "گراش", "گله دار", "لار", "لامرد", "لپوئي", "لطيفي", "مبارك آباد", "مرودشت", "مشكان", "مصيري", "مهر", "ميمند", "نوبندگان",
                "نوجين", "نودان", "نورآباد", "ني ريز", "وراوي", "هماشهر", "ارداق", "اسفرورين", "اقباليه", "الوند", "آبگرم", "آبيك", "آوج", "بوئين زهرا", "بيدستان", "تاكستان", "خاكعلي",
                "خرمدشت", "دانسفهان", "رازميان", "سگزآباد", "سيردان", "شال", "شريفيه", "ضياءآباد", "قزوين", "كوهين", "محمديه", "محمودآبادنمونه", "معلم كلايه", "نرجه", "جعفريه", "دستجرد",
                "سلفچگان", "قم", "قنوات", "كهك", "آرمرده", "بابارشاني", "بانه", "بلبان آباد", "بوئين سفلي", "بيجار", "چناره", "دزج", "دلبران", "دهگلان", "ديواندره",
                "زرينه", "سروآباد", "سريش آباد", "سقز", "سنندج", "شويشه", "صاحب", "قروه", "كامياران", "كاني دينار", "كاني سور", "مريوان", "موچش", "ياسوكند",
                "اختيارآباد", "ارزوئيه", "امين شهر", "انار", "اندوهجرد", "باغين", "بافت", "بردسير", "بروات", "بزنجان", "بم", "بهرمان", "پاريز",
                "جبالبارز", "جوپار", "جوزم", "جيرفت", "چترود", "خاتون آباد", "خانوك", "خورسند", "درب بهشت", "دوساري", "دهج", "رابر", "راور", "راين", "رفسنجان", "رودبار", "ريحان شهر", "زرند", "زنگي آباد", "زيدآباد", "سرچشمه", "سيرجان",
                "شهداد", "شهربابك", "صفائيه", "عنبرآباد", "فارياب", "فهرج", "قلعه گنج", "كاظم آباد", "كرمان", "كشكوئيه", "كوهبنان", "كهنوج", "كيانشهر", "گلباف", "گلزار", "لاله زار", "ماهان", "محمدآباد", "محي آباد", "مردهك", "منوجان",
                "نجف شهر", "نرماشير", "نظام شهر", "نگار", "نودژ", "هجدك", "هماشهر", "يزدان شهر", "ازگله", "اسلام آبادغرب", "باينگان", "بيستون", "پاوه", "تازه آباد", "جوانرود", "حميل", "رباط", "روانسر", "سرپل ذهاب", "سرمست",
                "سطر", "سنقر", "سومار", "شاهو", "صحنه", "قصرشيرين", "كرمانشاه", "كرندغرب", "كنگاور", "كوزران", "گهواره", "گيلانغرب", "ميان راهان", "نودشه", "نوسود", "هرسين", "هلشي", "باشت", "پاتاوه",
                "چرام", "چيتاب", "دوگنبدان", "دهدشت", "ديشموك", "سوق", "سي سخت", "قلعه رئيسي", "گراب سفلي", "لنده", "ليكك", "مادوان", "مارگون", "ياسوج", "انبارآلوم", "اينچه برون", "آزادشهر", "آق قلا",
                "بندرگز", "تركمن", "جلين", "خان ببين", "دلند", "راميان", "سرخنكلاته", "سيمين شهر", "علي آباد", "فاضل آباد", "كردكوي", "كلاله", "گاليكش", "گرگان", "گميش تپه", "گنبد كاووس", "مراوه تپه",
                "مينودشت", "نگين شهر", "نوده خاندوز", "نوكنده", "احمدسرگوراب", "اسالم", "اطاقور", "املش", "آستارا", "آستانه اشرفيه", "بازارجمعه", "بره سر", "بندرانزلي", "پره سر", "توتكابن", "جيرنده",
                "چابكسر", "چاف وچمخاله", "چوبر", "حويق", "خشكبيجار", "خمام", "ديلمان", "رانكوه", "رحيم آباد", "رستم آباد", "رشت", "رضوانشهر", "رودبار", "رودبنه",
                "رودسر", "سنگر", "سياهكل", "شفت", "شلمان", "صومعه سرا", "فومن", "كلاچاي", "كوچصفهان", "كومله", "كياشهر", "گوراب زرميخ", "لاهيجان", "لشت نشاء", "لنگرود", "لوشان", "لولمان", "لوندويل", "ليسار", "ماسال", "ماسوله", "مرجقل", "منجيل", "واجارگاه", "هشتپر", "ازنا", "اشترينان",
                "الشتر", "اليگودرز", "بروجرد", "پلدختر", "چالانچولان", "چغلوندي", "چقابل", "خرم آباد", "درب گنبد", "دورود", "زاغه", "سپيددشت", "سراب دوره", "شول آباد", "فيروزآباد", "كوناني", "كوهدشت", "گراب", "معمولان", "مؤمن آباد", "نورآباد", "ويسيان", "هفت چشمه", "اميركلا", "ايزدشهر", "آلاشت", "آمل", "بابل", "بابلسر", "بلده",
                "بهشهر", "بهنمير", "پل سفيد", "پول", "تنكابن", "جويبار", "چالوس", "چمستان", "خرم آباد", "خليل شهر", "خوش رودپي", "دابودشت", "رامسر", "رستمكلا", "رويان", "رينه", "زرگر محله", "زيرآب", "ساري", "سرخرود", "سلمان شهر", "سورك", "شيرگاه", "شيرود",
                "عباس آباد", "فريدونكنار", "فريم", "قائم شهر", "كتالم وسادات شهر", "كلارآباد", "كلاردشت", "كله بست", "كوهي خيل", "كياسر", "كياكلا", "گتاب", "گزنك", "گلوگاه", "محمودآباد", "مرزن آباد", "مرزيكلا", "نشتارود", "نكا", "نور", "نوشهر", "اراك",
                "آستانه", "آشتيان", "پرندك", "تفرش", "توره", "جاورسيان", "خشكرود", "خمين", "خنداب", "داودآباد", "دليجان", "رازقان", "زاويه", "ساروق", "ساوه", "سنجان", "شازند", "شهرجديدمهاجران", "غرق آباد", "فرمهين",
                "قورچي باشي", "كرهرود", "كميجان", "مأمونيه", "محلات", "ميلاجرد", "نراق", "نوبران", "نيمور", "هندودر", "ابوموسي", "بستك", "بندرجاسك", "بندرچارك", "بندرعباس", "بندرلنگه", "بيكاه", "پارسيان", "تخت",
                "جناح", "حاجي آباد", "خمير", "درگهان", "دهبارز", "رويدر", "زيارتعلي", "سردشت بشاگرد", "سرگز", "سندرك", "سوزا", "سيريك", "فارغان", "فين", "قشم", "قلعه قاضي", "كنگ", "كوشكنار",
                "كيش", "گوهران", "ميناب", "هرمز", "هشتبندي", "ازندريان", "اسدآباد", "برزول", "بهار", "تويسركان", "جورقان", "جوكار", "دمق", "رزن", "زنگنه", "سامن",
                "سركان", "شيرين سو", "صالح آباد", "فامنين", "فرسفج", "فيروزان", "قروه در جزين", "قهاوند", "كبودرآهنگ", "گل تپه", "گيان", "لالجين", "مريانج", "ملاير", "نهاوند", "همدان",
                "ابركوه", "احمدآباد", "اردكان", "اشكذر", "بافق", "بفروئيه", "بهاباد", "تفت", "حميديا", "خضرآباد", "ديهوك", "زارچ", "شاهديه", "طبس", "عشق آباد", "عقدا",
                "مروست", "مهردشت", "مهريز", "ميبد", "ندوشن", "نير", "هرات", "يزد"};
        private static String[] family = new String[]{
                "آبرامز", "آبراهامیان", "آتشی", "آریان‌پور", "آژند", "آشتیانی", "آشنا", "آشوری", "آقاجری", "آهنگر", "آهنگری", "آهی", "آیتی", "آرزومانیان", "آرشاکیان", "آرمن", "آرمین", "آزاده", "آشتیانی", "آصلانیان", "آغداشلو", "آقاجانیان", "آلبرت", "آلوسی", "آنانیان", "آواکیان", "آوانسیان", "آودیسیان", "آهارونیان", "آهنگر", "آیزاک", "آیوز", "ابوالقاسمی", "ابوترابی‌فرد", "احمدی", "احمری", "اردبیلی", "استپانیان", "استکی", "اسطرلابی", "اسعردی", "اسلامی", "اسماعیلی", "اشبروک", "اشتراوس", "اشکوری", "اصفهانی", "افتخاری", "افخم", "افخمی",
                "افضل", "اقبالی", "اکبر", "الباکیان", "اللهیاری", "الهام", "الهی", "امامی", "امیری", "امیریان", "امینی", "انصاری", "اوشاکان", "اولریش", "اوهانیان", "ایرانی", "ایزدی", "ایمانی", "باباجانیان", "بابایان", "بابایی", "باتمانقلیچ",
                "باتوانی", "باجو", "باخ", "بادالیان", "بارت", "بارزانی", "بارسقیان", "بارک‌زایی", "بارنز", "بارونیان", "باغداساریان", "باقرامیان", "باقرزاده", "باقری", "باکری", "باگراتونی", "بانکی", "باوئر", "باهنر", "بحرینی", "بخشی",
                "بداوی", "بدخشانی", "بدخشی", "برانداو", "براهنی", "بربریان", "برزویی", "برک", "برگمن", "برنز", "بزرگی", "بزرگیان", "بطحایی", "بقایی", "بلخی", "بلعمی", "بندیکت", "بوخنر", "بوسکتس", "بوسوئه", "بوشارد",
                "بوشهری", "بوغوسیان", "بویل", "بهادری", "بهارمست", "بهاری", "بهداد", "بهرامی", "بهروز", "بهزاد", "بهشتی", "بیاتی", "بیضایی", "بیگلری", "پاپازیان", "پاپیان", "پاستور", "پترسون",
                "پتروسیان", "پرز", "پمپئو", "پوانکاره", "پورجوادی", "پورمحمدی", "پوغوسیان", "پهلوی", "پیج", "پیر", "پیرنیا", "پیشوائیان", "پیمان", "تاد", "تبریزی", "تجویدی", "ترابی", "ترزیان",
                "ترنبول", "تروبتسکوی", "تریان", "تسلیمی", "تقوایی", "تقوی", "تمیمی", "تنکابنی", "توروسیان", "توسلی", "توسی", "توفیقی", "توکلی", "توکلیان", "توماسیان", "تومانیان", "تیگران", "تیگرانیان", "تیموشنکو", "ثقفی", "ثمری", "جابرانصاری", "جاوید", "جرجانی", "جعفری", "جلایی‌پور", "جلیلی", "جنتی", "جوادی", "جوان", "جونیور", "جوینی", "جهانبانی", "جهان‌بخش", "جیووانی", "چاوشی", "حائری", "حاتمی", "حاجیانی", "حاجی‌بابایی",
                "حجازی", "حدادی", "حسن‌پور", "حسن‌زاده", "حسنی", "حسین‌پور", "حسین‌زاده", "حسینی", "سلامی", "جعفریان", "جمادی", "جنتی", "جهانبگلو", "جهانگیری", "جهانی", "ابتکار", "ابریشمی", "ابطحی", "ابوذر",
                "ادب", "ارسباران", "استادی", "اشتری", "اشراقی", "اشکوری", "اصفهانی", "اصلانی", "اعتبار", "اعتماد", "اعلم", "افخم", "افخمی", "اللهیاری", "الهام", "امانت", "امانی", "امیری", "امین‌زاده", "انتظامی",
                "انوار", "انوری", "انوشه", "باستانی", "باطنی", "باغچه‌بان", "باهنر", "بحرینی", "بخاری", "بختیار", "بختیاری", "بدخشانی", "برزویی", "بزرگ‌نیا", "بهاور", "بهبهانی", "بهشتی", "بیگی", "پارسا", "پارسی", "پازارگاد",
                "پازوکی", "پایا", "پایدار", "پایور", "پستا", "پناهنده", "پناهی", "پناهیان", "پورناظری", "راسخ", "راوندی", "رجایی", "رحماندوست", "رحمانیان", "رستمی", "رسولی", "رفیعی", "رنجبر", "عارف", "عاشوری",
                "عالی", "عبادی", "عبدالکریمی", "عبدالملکی", "عراقی", "عزیزی", "عصار", "ذاکری", "ظریف", "داد", "دانایی‌فر", "دانایی‌فرد", "داودی", "داور", "دباغ", "درگاهی", "دری", "دستغیب",
                "دهقان", "دیباج", "صانعی", "صباغ", "صدر", "صدیق", "صدیقی", "صغیری", "صفوی", "خاموشی", "خداپناهی", "خدایی", "خراسانی", "خرم‌آبادی", "خسروپناه", "خمسه", "خیابانی", "شادمهر", "شاملو",
                "شاه‌حسینی", "شاهی", "شبستری", "شجاعی", "شرع‌پسند", "شرف", "شریعتمداری", "شریعتی", "شریف", "شریفیان", "شفا", "شهیدی", "شیرازی", "شیرمحمدی", "شیروانی", "ساعی", "سبحانی",
                "سبزواری", "سپه‌وند", "ستاری", "سحاب", "سحابی", "سراج", "سرشار", "سرمد", "سروستانی", "سروش", "سلامت", "سیف", "سیف‌زاده", "زارع", "زالی", "زرشناس", "زمردیان", "زهرایی", "رنگرز", "روحانی", "روزبه", "رهنما"

        };
        private static String[] names = new String[]{
                "بابک", "باربد", "بامداد", "بامین", "بامشاد", "بردیا", "بزرگمهر", "به‌آیین", "بهبد", "بهرام", "بهمن", "بهمنش", "بیژن", "بهروز", "بهراد", "بهرنگ", "بهزاد", "بهداد", "بهشاد", "بهنام", "برسام", "برزن", "آبتین", "آتش", "آترین", "آتورپات", "آذرخش", "آذرمه", "آذین", "آرتین", "آرام", "آراد", "آرتا", "آرش", "آرشام", "آرمان", "آرمین", "آریا", "آریابان", "آریانا",
                "آرین", "آریوبرزن", "آزاد", "آزرمگان", "آساد", "آستیاژ", "آستیاگ", "آوه", "آویژه", "آیین‌گشسب", "آریو", "آریافر", "فربد", "فرزان", "فرسا", "فرامرز", "فرزاد", "فرزام", "فرزین", "فردین", "فرداد", "فرود",
                "فرورتیش", "فرمان", "فرهنگ", "فریبرز", "فرناد", "فرهاد", "فرنام", "فرهام", "فرهود", "فروهر", "فیروز", "فرشاد", "فرشید", "فرخ", "کوروش", "کارن", "کامبیز", "کامران", "کامشاد", "کامیار",
                "کاوه", "کاووس", "کنارنگ", "کورس", "کورش", "کیانوش", "کیارش", "کیاوش", "کیا", "کیان", "کیوس", "کوشا", "کیخسرو", "کیقباد", "کیکاووس", "کیوان", "کیومرث", "مانی", "ماهان", "مرداس",
                "مهرگان", "مرداویج", "مزدک", "منوچهر", "مهبد", "مهداد", "مهرداد", "مهرزاد", "مهرشاد", "مهران", "مهزاد", "مهراب", "مهرشاد", "مهزیار", "مهیار", "مهرنگ", "میلاد", "پانیذ", "پائیزه",
                "پارمیس", "پدیده", "پرتو", "پردیس", "پرستو", "پرند", "پرنیا", "پرنیان", "پروانه", "پروین", "پری", "پریا", "پریچهر", "پریدخت", "پریرو", "پریزاد", "پریسا", "پریشاد",
                "پریماه", "پریناز", "پریوش", "پگاه", "پوپک", "پوران", "پوران", "پوراندخت", "پوری", "پونه", "پژهان", "پیمانه", "پرنیان", "پارمیدا", "پادینا", "شاپرک", "شاپری", "شادان",
                "شادی", "شانا", "شانار", "شایسته", "شبره", "شبنم", "شرمینه", "شکیبا", "شمیلا", "شمیم", "شهپر", "شهربانو", "شهرخ", "شهربانو", "شهرزاد", "شهرناز", "شهره",
                "شهناز", "شهین", "شوکا", "شقایق", "شکوفه", "شکوه", "شکیلا", "شیدا", "شیده", "شیرین", "شیرین‌بانو", "شیفته", "شیلا", "شیما", "شهاب", "شیوا", "شورانگیز", "گردآفرید", "گلاره", "گلاوژ", "گل‌افروز", "گل‌اندام",
                "گلبانو", "گلبهار", "گلابتون", "گلبیز", "گلپا", "گلپری", "گلپونه", "گلتاج", "گلتن", "گلرخ", "گلرو", "گلشن", "گلشید", "گلشیفته", "گلمیس", "گلنار", "گلناز", "گلنوش", "مازون", "مامک", "مانا",
                "ماندان", "ماندانا", "مانلی", "ماه‌پری", "ماهتو", "ماه‌چهر", "ماهدخت", "ماه‌برزین", "ماهنوش", "ماه‌جهان", "ماهزاد", "ماهک", "مرجان", "مرجانه", "مروارید", "مژده", "مژگان", "مسل", "مستانه", "مشکان‌دخت", "مشکین‌دخت",
                "مونا", "منیژه", "مهتا", "مهتاب", "مهدخت", "مهدیس", "مهرآذر", "مهرا", "مهراد", "مهراب", "مهرانگیز", "مهرانه", "مهربان", "مهرخ", "مهرسا", "مهروا", "مهرک", "مهری", "مهزاد",
                "مهسا", "مهستی", "مهشید", "مهکامه", "مهناز", "مهنوش", "مهکامه", "مهین", "نازآفرین", "نازگل", "نازنین", "نازیلا", "ناژیلا", "ناژین", "ناهید", "نرگس", "نرمین", "نسترن", "نسرین",
                "نگار", "نگین", "نهال", "نوا", "نوش‌آفرین", "نوشزاد", "نوشین", "نیلوفر", "نیکو"
        };
    }
}