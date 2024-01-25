import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Lclient!mq;")
	public static Class134 aClass134_2;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "Lclient!vm;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_56 = new Class140(64);

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	public static int anInt1953 = -1;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
	public static int anInt1954 = -1;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method1804() {
		if (Static292.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static340.anInt3938;
		@Pc(10) int local10 = Static78.anInt1584;
		@Pc(18) int local18 = Static328.anInt6274 - local8 - Static11.anInt5389;
		@Pc(31) int local31 = Static262.anInt5078 - local10 - Static320.anInt6140;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static232.aFrame3 == null) {
				local52 = Static180.aClass110_6.anApplet1;
			} else {
				local52 = Static232.aFrame3;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (Static232.aFrame3 == local52) {
				@Pc(67) Insets local67 = Static232.aFrame3.getInsets();
				local61 = local67.top;
				local59 = local67.left;
			}
			@Pc(76) Graphics local76 = local52.getGraphics();
			local76.setColor(Color.black);
			if (local8 > 0) {
				local76.fillRect(local59, local61, local8, Static262.anInt5078);
			}
			if (local10 > 0) {
				local76.fillRect(local59, local61, Static328.anInt6274, local10);
			}
			if (local18 > 0) {
				local76.fillRect(local59 + Static328.anInt6274 - local18, local61, local18, Static262.anInt5078);
			}
			if (local31 > 0) {
				local76.fillRect(local59, local61 + Static262.anInt5078 - local31, Static328.anInt6274, local31);
				return;
			}
		} catch (@Pc(137) Exception local137) {
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZZ)V")
	public static void method1806(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			Static261.anInt5069--;
			if (Static261.anInt5069 == 0) {
				Static56.anIntArray140 = null;
			}
		}
		Static278.anInt5397--;
		if (Static278.anInt5397 == 0) {
			Static220.anIntArray551 = null;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!rg;II)V")
	public static void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2) {
		Static7.anInt161 = arg2;
		Static293.aClass177_19 = arg1;
		Static183.anInt3795 = arg0;
	}
}
