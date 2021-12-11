# AOP25
interceptor+myComposed+spring-boot-starter-AOP+create-Homemade-annotation</br>
@Value(my value) -הנתונים חייבים להיות בסטרינג, הספרינג כבר ימיר אותם לבד למה שצריך.</br>
@Autowired-על מנת לאתחל אובייקט מוכן לעבודה בשיטה של IOC, אנחנו נשתמש באונטציה 
</br>
Component – מרכיב (רכיב) שמנוהל ע"י ספרינג .
</br>@Lazy – המערכת תצור את האובייקט רק כאשר היא תתבקש
</br>@Eager – המערכת כבר תכין את הכל, וכשנצטרך את האובייקט, רק אז היא תביא את מה שצריך, כלומר הבנאי כבר מוכן לעבודה.
ברירת מחדל של ספרינג יהיה תמיד EAGER.
</br>
@Bean-מופע של מחלקה (המחלקה הראשונית)
</br>
@Configuration- כאשר משתמשים באנוטציה ספרינג יחפש את כל הבינס לאורך התוכנה שבתקיית הקבצים-Factory Method design pattren
</br>
MyComposed Class - איחוד מחלקות שונות לאחת 
</br>
Interceptor-תפיסת אירוע לא מחייב Exeption </br>
נשתמש באינטרפייס BeanPostProcessor ליירט פעולות לפני או אחרי אתחול מופע (מעין בדיקת ולידציה)
</br>
PostProcessBefor/AfterInitialization
</br>
AOP- בעזרתו אוכל ליצור אנוטציות משלי עמ לבצע סדרת תהליכיםהמבוצעים על פעולות מסויימות או ברמות מסויימות 
</br>
</br>
CREATE NEW ANNOTAION
</br>
AOP dependency add @EnableAspectJAutoProxy under @SpringBootApplication
</br> 
1.בנייה של האנוטציה 
</br>2.Service
</br>3.בניה של היירוט
</br>
הוספת @ למילה לפני המילה אינטרפייס </br>
@Target()- יקבע לי באיזה מצבים תופעל האנוטציה :</br>
typ,const,method,filed </br>
@Rentention-מתי האנוטציה שבניתי תופעל</br>
@Aspect- קישור ביו האנוטציה שבניתי לבין מה שהיא עושה </br>
כלומר הסרביס אומר  מה תישה האנוטציה בפועל ,האנוטציה אומרת לאן לפנות ,אספקט בעצם יחבר בין המה לעשות ללאן לפנות 
</br>
הסברים נוספים בקובץ

