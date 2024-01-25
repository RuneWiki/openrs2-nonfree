import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	public static int anInt1647;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_2 = new Class144(64);

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_39 = new Class140(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_10 = new Class107(500);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	public static void method1743() {
		Static165.aClass107_18.method3011(5);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!bs;BI)Lclient!am;")
	public static Class11 method1744(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class11 local17;
		if (Static138.aClass11_3 == null) {
			local17 = new Class11();
		} else {
			local17 = Static138.aClass11_3;
			Static138.aClass11_3 = Static138.aClass11_3.aClass11_1;
			Static347.anInt6748--;
			local17.aClass11_1 = null;
		}
		local17.anInt217 = arg1;
		local17.aClass1_Sub2_1 = arg0;
		return local17;
	}
}
