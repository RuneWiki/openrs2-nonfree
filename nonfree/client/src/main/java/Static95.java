import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_55 = new Class151("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_56 = new Class151("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!el", name = "m", descriptor = "F")
	public static float aFloat27 = 0.0F;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!ji;Ljava/lang/Object;)V")
	public static void method1359(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static252.method2874(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method1362() {
		try {
			if (Static356.anInt5885 == 1) {
				@Pc(14) int local14 = Static312.aClass1_Sub9_Sub4_3.method4624();
				if (local14 > 0 && Static312.aClass1_Sub9_Sub4_3.method4603()) {
					local14 -= Static442.anInt7354;
					if (local14 < 0) {
						local14 = 0;
					}
					Static312.aClass1_Sub9_Sub4_3.method4605(local14);
				} else {
					Static312.aClass1_Sub9_Sub4_3.method4607();
					Static312.aClass1_Sub9_Sub4_3.method4631();
					Static400.aClass1_Sub43_5 = null;
					Static205.aClass219_1 = null;
					if (Static436.aClass113_131 == null) {
						Static356.anInt5885 = 0;
					} else {
						Static356.anInt5885 = 2;
					}
				}
			}
		} catch (@Pc(52) Exception local52) {
			local52.printStackTrace();
			Static312.aClass1_Sub9_Sub4_3.method4607();
			Static205.aClass219_1 = null;
			Static356.anInt5885 = 0;
			Static436.aClass113_131 = null;
			Static400.aClass1_Sub43_5 = null;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	public static boolean method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static405.anInt6552; local1++) {
			@Pc(6) Class147 local6 = Static203.aClass147Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3694 == 1) {
				local15 = local6.anInt3698 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3700 + (local6.anInt3692 * local15 >> 8);
					local37 = local6.anInt3697 + (local6.anInt3689 * local15 >> 8);
					local47 = local6.anInt3706 + (local6.anInt3707 * local15 >> 8);
					local57 = local6.anInt3703 + (local6.anInt3705 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3694 == 2) {
				local15 = arg0 - local6.anInt3698;
				if (local15 > 0) {
					local27 = local6.anInt3700 + (local6.anInt3692 * local15 >> 8);
					local37 = local6.anInt3697 + (local6.anInt3689 * local15 >> 8);
					local47 = local6.anInt3706 + (local6.anInt3707 * local15 >> 8);
					local57 = local6.anInt3703 + (local6.anInt3705 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3694 == 3) {
				local15 = local6.anInt3700 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3701 * local15 >> 8);
					local37 = local6.anInt3690 + (local6.anInt3696 * local15 >> 8);
					local47 = local6.anInt3706 + (local6.anInt3707 * local15 >> 8);
					local57 = local6.anInt3703 + (local6.anInt3705 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3694 == 4) {
				local15 = arg2 - local6.anInt3700;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3701 * local15 >> 8);
					local37 = local6.anInt3690 + (local6.anInt3696 * local15 >> 8);
					local47 = local6.anInt3706 + (local6.anInt3707 * local15 >> 8);
					local57 = local6.anInt3703 + (local6.anInt3705 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3694 == 5) {
				local15 = arg1 - local6.anInt3706;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3701 * local15 >> 8);
					local37 = local6.anInt3690 + (local6.anInt3696 * local15 >> 8);
					local47 = local6.anInt3700 + (local6.anInt3692 * local15 >> 8);
					local57 = local6.anInt3697 + (local6.anInt3689 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
