import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt276 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!oe;BLclient!oe;)V")
	public static void method186(@OriginalArg(0) Class72 arg0, @OriginalArg(2) Class72 arg1) {
		Static36.aClass72_40 = arg1;
		Static158.aClass72_220 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!nh;)V")
	public static void method187(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static106.aClass99_2 != null) {
			@Pc(16) int local16;
			try {
				Static106.aClass99_2.method3579(0L);
				local16 = 0;
				Static106.aClass99_2.method3569(local4);
				while (local16 < 24 && local4[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local16 = 0; local16 < 24; local16++) {
					local4[local16] = -1;
				}
			}
		}
		arg0.method2089(24, local4);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIZ)Lclient!qe;")
	public static Class78 method189(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(26) int local26 = arg0 / 10;
		@Pc(28) int local28 = 1;
		while (local26 != 0) {
			local26 /= 10;
			local28++;
		}
		@Pc(41) int local41 = local28;
		if (arg0 < 0 || arg1) {
			local41 = local28 + 1;
		}
		@Pc(49) byte[] local49 = new byte[local41];
		if (arg0 < 0) {
			local49[0] = 45;
		} else if (arg1) {
			local49[0] = 43;
		}
		for (@Pc(67) int local67 = 0; local67 < local28; local67++) {
			@Pc(72) int local72 = arg0 % 10;
			arg0 /= 10;
			if (local72 < 0) {
				local72 = -local72;
			}
			if (local72 > 9) {
				local72 += 39;
			}
			local49[local41 - local67 - 1] = (byte) (local72 + 48);
		}
		@Pc(111) Class78 local111 = new Class78();
		local111.aByteArray48 = local49;
		local111.anInt3831 = local41;
		return local111;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)Lclient!qe;")
	public static Class78 method190(@OriginalArg(0) long arg0) {
		Static198.aCalendar2.setTime(new Date(arg0));
		@Pc(21) int local21 = Static198.aCalendar2.get(7);
		@Pc(25) int local25 = Static198.aCalendar2.get(5);
		@Pc(29) int local29 = Static198.aCalendar2.get(2);
		@Pc(33) int local33 = Static198.aCalendar2.get(1);
		@Pc(37) int local37 = Static198.aCalendar2.get(11);
		@Pc(41) int local41 = Static198.aCalendar2.get(12);
		@Pc(45) int local45 = Static198.aCalendar2.get(13);
		return Static94.method1640(new Class78[] { Static202.aClass78Array36[local21 - 1], Static198.aClass78_783, Static19.method268(local25 / 10), Static19.method268(local25 % 10), Static87.aClass78_431, Static72.aClass78Array37[local29], Static87.aClass78_431, Static19.method268(local33), Static173.aClass78_693, Static19.method268(local37 / 10), Static19.method268(local37 % 10), Static35.aClass78_110, Static19.method268(local41 / 10), Static19.method268(local41 % 10), Static35.aClass78_110, Static19.method268(local45 / 10), Static19.method268(local45 % 10), Static60.aClass78_198 });
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public static void method191() {
		Static132.anInt3014 = 0;
		@Pc(17) int local17 = Static28.anInt497 + (Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7);
		@Pc(24) int local24 = Static57.anInt628 + (Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static132.anInt3014 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static132.anInt3014 = 1;
		}
		if (Static132.anInt3014 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static132.anInt3014 = 0;
		}
	}
}
