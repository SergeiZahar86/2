package УрокиПоJAVA._219_Аннотации_Встроеные;
public class Q {
    /*
Аннотацию можно связать с любым объявлением. Например, аннотировать можно классы,
методы, поля , параметры и константы перечислимого типа. Аннотированной может быть даже
 сама аннотация. Но в любом случае аннотация предшествует остальной части объявления.

/////////////////////////////////////////

    В Java определено немало встроенных аннотаций. Большинство встроенных аннотаций
    имеют специальное назначение, но девять из них - общее назначение. Следующие четыре
     аннотации из этих девяти импортируются из пакета java.lang.annotation: @Retention,
      @Documented, @Target и @Inherited. А еще пять аннотаций - @Override, @Deprecated,
      @FunctionalInterface , @SafeVarargs и @SuppressWarnings - входят в состав
      пакета java.lang. Каждая из них описана ниже.

/////////////////////////////////////////

      В версии JDK 8 пакет java.lang.annotation был дополнен аннотациями
@Repeatable и @Native. Первая из них служит для поддержки повторяющихся аннотаций,
как поясняется далее в этой главе, а вторая - для аннотирования полей, доступных из
платформенно-ориентированного кода.

///////////////////////////////////

Аннотация @Retention
Предназначена для применения только в качестве аннотации к другим аннотациям.
Она определяет правило удержания, как пояснялось ранее в этой главе.

////////////////////////////////////

Аннотация @Documented
Служит маркерным интерфейсом, сообщающим инструментальному средству
разработки , что аннотация должна быть документирована. Она предназначена
для применения только в качестве аннотации к объявлению другой аннотации.

////////////////////////////////////

Аннотация @Target
Задает типы элементов, к которым можно применять аннотацию. Она предназначена
для применения только в качестве аннотации к другим аннотациям.
Аннотация @Target принимает один аргумент, который должен быть константой
из перечисления ElementType. Этот аргумент задает типы объявляемых
элементов, к которым можно применять аннотацию. Эти константы приведены
в табл.12.1 вместе с типами объявляемых элементов, к которым они относятся.
В аннотации @Target можно задать одно или несколько значений этих констант.
Чтобы задать несколько значений, их следует указать списком, заключив
в фигурные скобки. Например, чтобы указать, что аннотация применяется только
к полям и локальным переменным, достаточно определить следующую аннотацию
@Target :
@Target ({ ElementType.FIELD, ElementType.LOCAL_VARIABLE })

ANNOTATION ТУРЕ   Другая аннотация
CONSTRUCTOR
FIELD
LOCAL VARIABLE
METHOD
PACKAGE
PARAMETER
ТУРЕ
ТУРЕ PARAMETER
ТУРЕ USE

//////////////////////////////////

Аннотация @Inherited
Это - аннотация-маркер, которую можно применять только в другом объявлении
аннотации. Более того, она оказывает воздействие только на те аннотации, которые
будут применяться в объявлениях классов. Аннотация @Inherited обусловливает наследование
аннотации из суперкласса в подклассе.

/////////////////////////////////

Аннотация @Override
Это - аннотация-маркер, которую можно применять только в методах. Метод,
аннотированный как @Override , должен переопределять метод из суперкласса.
Если он этого не сделает, во время компиляции возникнет ошибка. Эта аннотация
служит для гарантии того, что метод из суперкласса будет действительно переопределен,
а не просто перегружен.

///////////////////////////////

Аннотация @Deprecated
Эта аннотация-маркер обоаначает, что объявление устарело и должно быть заменено
более новой формой.

////////////////////////////////

Аннотация  @FunctionalInterface
Эта аннотация-маркер внедрена в верси и JDK 8 и предназначена для применения в
интерфейсах.  Она обозначает, что аннотируемый интерфейс является
функциональным, т.е. содержит один и только один абстрактный метод.
Функциональные интерфейсы применяются в лямбда-выражениях.

//////////////////////////////////

Аннотация @ SafeVarargs
Это - аннотация-маркер, применяемая в методах и конструкторах. Она указывает
на отсутствие каких-нибудь небезопасных действий, связанных с параметром
переменной длины. Эта аннотация служит для подавления непроверяемых предупреждений,
возникающих в коде, который в остальном является безопасным, в связи
с применением неовеществляемых типов аргументов переменной длины и получением
экземпляра параметризированного массива.

/////////////////////////////////////

Аннотация @SuppressWarnings
Эта аннотация обозначает, что следует подавить одно или несколько предупреждений,
которые могут быть выданы компилятором. Подавляемые предупреждения
указываются по имени в строковой форме.
     */
}
