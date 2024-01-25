import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_34 = new Class126(85, 8);

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_1 = new Class326(14, 0);

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_2 = new Class326(15, 4);

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_3 = new Class326(16, -2);

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_4 = new Class326(17, 0);

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_5 = new Class326(18, -2);

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_6 = new Class326(19, -2);

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_7 = new Class326(22, -2);

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_8 = new Class326(23, 4);

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_9 = new Class326(24, -1);

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_10 = new Class326(26, 0);

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_11 = new Class326(27, 0);

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!sj;")
	public static final Class326 aClass326_12 = new Class326(28, -2);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1924(@OriginalArg(1) String arg0) {
		if (!Static652.aClass231_6.aBoolean482) {
			return -1;
		} else if (Static647.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static201.method3189(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static311.aString72 + local25;
			if (!Static284.aClass143_76.method3122("", local38)) {
				return -1;
			} else if (Static284.aClass143_76.method3118(local38)) {
				@Pc(62) byte[] local62 = Static284.aClass143_76.method3119(local38, "");
				@Pc(68) File local68;
				try {
					local68 = Static590.method7926(local25);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static42.method1222(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
						if (local62[local91] != local82[local91]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static652.aClass231_6.method5287(local62, local68);
					}
				} catch (@Pc(127) Throwable local127) {
					return -1;
				}
				Static1.method8423(local68, arg0);
				return 100;
			} else {
				return Static284.aClass143_76.method3121(local38);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!gj;B)V")
	public static void method1925(@OriginalArg(0) Class143 arg0) {
		Static239.aClass143_59 = arg0;
	}
}
