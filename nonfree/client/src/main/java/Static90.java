import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!p;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt1840;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/awt/Image;")
	public static Image anImage5;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt1844;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt1841 = 0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt1842 = -1;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt1847 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIILclient!sf;)Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 method1289(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		return Static80.method1490(arg2, arg1, arg0) ? Static47.method1039() : null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III[BLclient!be;[Lclient!da;IIIII)V")
	public static void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class13[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub12 local10 = new Class1_Sub12(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1180();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method1180();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local10.method1190();
				@Pc(57) int local57 = local24 >> 12;
				@Pc(61) int local61 = local53 >> 2;
				@Pc(65) int local65 = local53 & 0x3;
				if (arg2 == local57 && arg9 <= local49 && local49 < arg9 + 8 && arg1 <= local43 && arg1 + 8 > local43) {
					@Pc(98) Class1_Sub1_Sub9 local98 = Static122.method1995(local12);
					@Pc(116) int local116 = arg7 + Static127.method2028(local43 & 0x7, local65, arg8, local49 & 0x7, local98.anInt2065, local98.anInt2083);
					@Pc(134) int local134 = arg6 + Static129.method2041(local65, local98.anInt2083, local98.anInt2065, arg8, local43 & 0x7, local49 & 0x7);
					if (local116 > 0 && local134 > 0 && local116 < 103 && local134 < 103) {
						@Pc(151) int local151 = arg0;
						@Pc(153) Class13 local153 = null;
						if ((Static87.aByteArrayArrayArray15[1][local116][local134] & 0x2) == 2) {
							local151 = arg0 - 1;
						}
						if (local151 >= 0) {
							local153 = arg5[local151];
						}
						Static83.method1509(local12, local134, arg8 + local65 & 0x3, local153, arg4, local116, local61, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1291() {
		for (@Pc(15) Class1_Sub4 local15 = (Class1_Sub4) Static71.aClass61_12.method1748(); local15 != null; local15 = (Class1_Sub4) Static71.aClass61_12.method1760()) {
			if (local15.anInt436 > 0) {
				local15.anInt436--;
			}
			if (local15.anInt436 != 0) {
				if (local15.anInt440 > 0) {
					local15.anInt440--;
				}
				if (local15.anInt440 == 0 && local15.anInt437 >= 1 && local15.anInt429 >= 1 && local15.anInt437 <= 102 && local15.anInt429 <= 102 && (local15.anInt428 < 0 || Static130.method2042(local15.anInt433, local15.anInt428))) {
					Static74.method1424(local15.anInt433, local15.anInt441, local15.anInt428, local15.anInt429, local15.anInt437, local15.anInt443, local15.anInt434);
					local15.anInt440 = -1;
					if (local15.anInt428 == local15.anInt431 && local15.anInt431 == -1) {
						local15.method2050();
					} else if (local15.anInt428 == local15.anInt431 && local15.anInt434 == local15.anInt430 && local15.anInt432 == local15.anInt433) {
						local15.method2050();
					}
				}
			} else if (local15.anInt431 < 0 || Static130.method2042(local15.anInt432, local15.anInt431)) {
				Static74.method1424(local15.anInt432, local15.anInt441, local15.anInt431, local15.anInt429, local15.anInt437, local15.anInt443, local15.anInt430);
				local15.method2050();
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public static void method1293() {
		aLongArray7 = null;
		anImage5 = null;
		aClass54_2 = null;
	}
}
