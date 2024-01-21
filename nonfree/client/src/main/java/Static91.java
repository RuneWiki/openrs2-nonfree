import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!ob;")
	public static Class60 aClass60_4 = null;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_904 = Static169.method2903("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!n;")
	public static Class56 aClass56_7 = new Class56();

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!ed;")
	private static Class23 aClass23_905 = Static169.method2903("glow2:");

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_906 = aClass23_905;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_907 = aClass23_905;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_908 = Static169.method2903("Art");

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt2415 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1595() {
		for (@Pc(12) int local12 = 0; local12 < Static104.anInt2660; local12++) {
			@Pc(18) int local18 = Static60.anIntArray611[local12];
			@Pc(22) Class1_Sub1_Sub1_Sub1_Sub1 local22 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
			@Pc(26) int local26 = Static35.aClass1_Sub8_Sub1_2.method861();
			if ((local26 & 0x4) != 0) {
				local26 += Static35.aClass1_Sub8_Sub1_2.method861() << 8;
			}
			Static129.method2295(local18, local22, local26);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1596(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1819 == 0) {
			return;
		}
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg0.anInt1865 != -1 && arg0.anInt1865 < 32768) {
			@Pc(28) Class1_Sub1_Sub1_Sub1_Sub2 local28 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1865];
			if (local28 != null) {
				local37 = arg0.anInt1838 - local28.anInt1838;
				local44 = arg0.anInt1825 - local28.anInt1825;
				if (local37 != 0 || local44 != 0) {
					arg0.anInt1860 = (int) (Math.atan2((double) local37, (double) local44) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(69) int local69;
		if (arg0.anInt1865 >= 32768) {
			local69 = arg0.anInt1865 - 32768;
			if (local69 == Static72.anInt1984) {
				local69 = 2047;
			}
			@Pc(82) Class1_Sub1_Sub1_Sub1_Sub1 local82 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local69];
			if (local82 != null) {
				@Pc(91) int local91 = arg0.anInt1825 - local82.anInt1825;
				local44 = arg0.anInt1838 - local82.anInt1838;
				if (local44 != 0 || local91 != 0) {
					arg0.anInt1860 = (int) (Math.atan2((double) local44, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1840 != 0 || arg0.anInt1833 != 0) && (arg0.anInt1863 == 0 || arg0.anInt1814 > 0)) {
			local69 = arg0.anInt1838 - (arg0.anInt1840 - Static152.anInt3545 - Static152.anInt3545) * 64;
			local37 = arg0.anInt1825 - (arg0.anInt1833 - Static75.anInt2039 - Static75.anInt2039) * 64;
			if (local69 != 0 || local37 != 0) {
				arg0.anInt1860 = (int) (Math.atan2((double) local69, (double) local37) * 325.949D) & 0x7FF;
			}
			arg0.anInt1840 = 0;
			arg0.anInt1833 = 0;
		}
		local69 = arg0.anInt1860 - arg0.anInt1843 & 0x7FF;
		if (local69 == 0) {
			arg0.anInt1827 = 0;
			return;
		}
		arg0.anInt1827++;
		@Pc(226) boolean local226;
		if (local69 > 1024) {
			arg0.anInt1843 -= arg0.anInt1819;
			local226 = true;
			if (arg0.anInt1819 > local69 || local69 > 2048 - arg0.anInt1819) {
				local226 = false;
				arg0.anInt1843 = arg0.anInt1860;
			}
			if (arg0.anInt1823 == arg0.anInt1835 && (arg0.anInt1827 > 25 || local226)) {
				if (arg0.anInt1859 == -1) {
					arg0.anInt1835 = arg0.anInt1820;
				} else {
					arg0.anInt1835 = arg0.anInt1859;
				}
			}
		} else {
			arg0.anInt1843 += arg0.anInt1819;
			local226 = true;
			if (arg0.anInt1819 > local69 || 2048 - arg0.anInt1819 < local69) {
				local226 = false;
				arg0.anInt1843 = arg0.anInt1860;
			}
			if (arg0.anInt1823 == arg0.anInt1835 && (arg0.anInt1827 > 25 || local226)) {
				if (arg0.anInt1817 == -1) {
					arg0.anInt1835 = arg0.anInt1820;
				} else {
					arg0.anInt1835 = arg0.anInt1817;
				}
			}
		}
		arg0.anInt1843 &= 0x7FF;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	public static void method1597() {
		aClass23_906 = null;
		aClass23_907 = null;
		aCanvas1 = null;
		aClass23_908 = null;
		aClass23_904 = null;
		aClass56_7 = null;
		aClass60_4 = null;
		aClass23_905 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1598() {
		@Pc(9) int local9 = Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3056(Static153.aClass23_1441);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static38.anInt1037; local11++) {
			local19 = Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3056(Static152.method2436(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static164.aBoolean201 = true;
		Static27.anInt864 = Static38.anInt1037 * 15 + 22;
		local19 = Static38.anInt1037 * 15 + 21;
		local9 += 8;
		@Pc(58) int local58 = Static38.anInt1049 - local9 / 2;
		@Pc(60) int local60 = Static165.anInt4054;
		if (local58 + local9 > 765) {
			local58 = 765 - local9;
		}
		if (local60 + local19 > 503) {
			local60 = 503 - local19;
		}
		Static141.anInt3598 = local9;
		if (local60 < 0) {
			local60 = 0;
		}
		Static112.anInt2868 = local60;
		if (local58 < 0) {
			local58 = 0;
		}
		Static94.anInt2451 = local58;
	}
}
