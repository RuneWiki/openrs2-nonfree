import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt1636;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[Lclient!go;")
	public static final Class5_Sub2_Sub6[] aClass5_Sub2_Sub6Array2 = new Class5_Sub2_Sub6[14];

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	public static int anInt1639 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
	public static boolean method1331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!sj;)V")
	public static void method1332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub3_Sub2 arg2) {
		if (arg2.anInt6193 == arg0 && arg0 != -1) {
			@Pc(88) Class143 local88 = Static271.aClass219_4.method4752(arg0);
			@Pc(91) int local91 = local88.anInt3772;
			if (local91 == 1) {
				arg2.anInt6159 = 0;
				arg2.anInt6147 = arg1;
				arg2.anInt6143 = 0;
				arg2.anInt6117 = 0;
				arg2.anInt6183 = 1;
				Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg2, local88, arg2.anInt7500, arg2.anInt6117, arg2.anInt7502, arg2.aByte105);
			}
			if (local91 == 2) {
				arg2.anInt6159 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt6193 == -1 || Static271.aClass219_4.method4752(arg0).anInt3783 >= Static271.aClass219_4.method4752(arg2.anInt6193).anInt3783) {
			arg2.anInt6196 = arg2.anInt6199;
			arg2.anInt6183 = 1;
			arg2.anInt6159 = 0;
			arg2.anInt6193 = arg0;
			arg2.anInt6147 = arg1;
			arg2.anInt6117 = 0;
			arg2.anInt6143 = 0;
			if (arg2.anInt6193 != -1) {
				Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg2, Static271.aClass219_4.method4752(arg2.anInt6193), arg2.anInt7500, arg2.anInt6117, arg2.anInt7502, arg2.aByte105);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1333(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static63.aCharArray1[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(74) int local74 = local48.length() - 1;
					local48.setCharAt(local74, Character.toUpperCase(local48.charAt(local74)));
					local66 = ' ';
				}
				local48.append(local66);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z")
	public static boolean method1334() {
		try {
			if (Static223.anInt3720 == 2) {
				if (Static440.aClass5_Sub37_2 == null) {
					Static440.aClass5_Sub37_2 = Static472.method4952(Static199.aClass243_113, Static216.anInt3609, Static215.anInt3592);
					if (Static440.aClass5_Sub37_2 == null) {
						return false;
					}
				}
				if (Static76.aClass13_1 == null) {
					Static76.aClass13_1 = new Class13(Static331.aClass243_184, Static133.aClass243_75);
				}
				if (Static210.aClass5_Sub22_Sub1_1.method2749(Static260.aClass243_141, Static76.aClass13_1, Static440.aClass5_Sub37_2)) {
					Static210.aClass5_Sub22_Sub1_1.method2730();
					Static210.aClass5_Sub22_Sub1_1.method2762(Static178.anInt5791);
					Static210.aClass5_Sub22_Sub1_1.method2736(Static151.aBoolean499, Static440.aClass5_Sub37_2);
					Static76.aClass13_1 = null;
					Static199.aClass243_113 = null;
					Static440.aClass5_Sub37_2 = null;
					Static223.anInt3720 = 0;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static210.aClass5_Sub22_Sub1_1.method2747();
			Static199.aClass243_113 = null;
			Static440.aClass5_Sub37_2 = null;
			Static76.aClass13_1 = null;
			Static223.anInt3720 = 0;
		}
		return false;
	}
}
