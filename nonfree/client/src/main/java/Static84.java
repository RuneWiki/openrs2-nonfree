import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1326 = Static151.method2243("VOLL");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!q;")
	public static final Class79 aClass79_11 = new Class79(5);

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1327 = Static151.method2243("(Y");

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1328 = Static151.method2243("::autoshadow off");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
	public static final int[] anIntArray328 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2582(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(14) String local14 = "";
			if (arg1 != null) {
				local14 = Static199.method2923(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local14 = local14 + " | ";
				}
				local14 = local14 + arg0;
			}
			System.out.println("Error: " + local14);
			local14 = local14.replace(':', '.');
			local14 = local14.replace('@', '_');
			local14 = local14.replace('&', '_');
			local14 = local14.replace('#', '_');
			if (Static33.aClass41_1.anApplet1 != null) {
				@Pc(108) Class56 local108 = Static33.aClass41_1.method1052(new URL(Static33.aClass41_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static145.anInt3128 + "&u=" + Static73.aLong56 + "&v1=" + Static75.aString4 + "&v2=" + Static75.aString2 + "&e=" + local14));
				while (local108.anInt2418 == 0) {
					Static117.method1813(1L);
				}
				if (local108.anInt2418 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local108.anObject2;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z")
	public static boolean method2585(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
