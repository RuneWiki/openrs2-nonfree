import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!er", name = "d", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	public static final int anInt2199 = 1;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "[I")
	public static final int[] anIntArray131 = new int[14];

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	public static int anInt2201 = -2;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
	public static final int[] anIntArray133 = new int[13];

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_42 = new Class119(86, -1);

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method1703() {
		for (@Pc(1) int local1 = 0; local1 < Static319.anInt1933; local1++) {
			@Pc(6) Class219 local6 = Static25.aClass219Array1[local1];
			if (local6.aByte97 == 2) {
				if (local6.aClass3_Sub5_Sub2_4 == null) {
					local6.anInt6082 = Integer.MIN_VALUE;
				} else {
					Static331.aClass3_Sub5_Sub1_42.method886(local6.aClass3_Sub5_Sub2_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IJIIZLjava/lang/String;ZBLjava/lang/String;ZI)V")
	public static void method1708(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) String arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(21) int[] local21 = new int[4];
		for (@Pc(23) int local23 = 0; local23 < 3; local23++) {
			local21[local23] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(42) Class3_Sub7 local42 = new Class3_Sub7(128);
		local42.method2628(10);
		local42.method2613((arg6 ? 4 : 0) | (arg8 ? 1 : 0) | (arg4 ? 2 : 0));
		local42.method2603(arg1);
		local42.method2636(local21[0]);
		local42.method2608(arg7);
		local42.method2636(local21[1]);
		local42.method2613(Static17.anInt475);
		local42.method2628(arg9);
		local42.method2628(arg3);
		local42.method2636(local21[2]);
		local42.method2613(arg2);
		local42.method2613(arg0);
		local42.method2636(local21[3]);
		local42.method2581(Static3.aBigInteger1, Static134.aBigInteger2);
		@Pc(132) Class3_Sub7 local132 = new Class3_Sub7(350);
		local132.method2608(arg5);
		@Pc(144) int local144 = 8 - Static24.method582(arg5) % 8;
		for (@Pc(146) int local146 = 0; local146 < local144; local146++) {
			local132.method2628((int) (Math.random() * 255.0D));
		}
		local132.method2621(local21);
		Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
		Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_8.anInt5402);
		Static302.aClass3_Sub7_Sub1_2.method2613(local132.anInt3235 + local42.anInt3235 + 2);
		Static302.aClass3_Sub7_Sub1_2.method2613(590);
		Static302.aClass3_Sub7_Sub1_2.method2595(local42.anInt3235, local42.aByteArray46);
		Static302.aClass3_Sub7_Sub1_2.method2595(local132.anInt3235, local132.aByteArray46);
		Static80.anInt2014 = 0;
		Static116.anInt5389 = 1;
		Static286.anInt1444 = 0;
		Static443.anInt4523 = -3;
	}
}
