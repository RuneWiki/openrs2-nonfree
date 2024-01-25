import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!wv;")
	public static final Class393 aClass393_2 = new Class393();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1345(@OriginalArg(1) String arg0) {
		if (Static239.aStringArray27 == null) {
			Static539.method6914();
		}
		Static382.aCalendar1.setTime(new Date(Static15.method380()));
		@Pc(22) int local22 = Static382.aCalendar1.get(11);
		@Pc(26) int local26 = Static382.aCalendar1.get(12);
		@Pc(30) int local30 = Static382.aCalendar1.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(74) String[] local74 = Static120.method1814(arg0, '\n');
		for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
			for (@Pc(80) int local80 = Class14_Sub26.anInt9540; local80 > 0; local80--) {
				Static239.aStringArray27[local80] = Static239.aStringArray27[local80 - 1];
			}
			Static239.aStringArray27[0] = local64 + ": " + local74[local76];
			if (Static268.aFileOutputStream1 != null) {
				try {
					Static268.aFileOutputStream1.write(Static542.method6953(Static239.aStringArray27[0] + "\n"));
				} catch (@Pc(126) IOException local126) {
				}
			}
			if (Static239.aStringArray27.length - 1 > Class14_Sub26.anInt9540) {
				if (Static76.anInt1484 > 0) {
					Static76.anInt1484++;
				}
				Class14_Sub26.anInt9540++;
			}
		}
	}
}
