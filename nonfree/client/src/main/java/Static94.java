import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
	public static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
	public static final int[] anIntArray123 = new int[1];

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public static int anInt2154 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BIZLjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method1671(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static280.aCanvas3.getGraphics();
			if (Static400.aFont1 == null) {
				Static400.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static348.anInt6272, Static199.anInt3767);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static333.anImage2 == null) {
					Static333.anImage2 = Static280.aCanvas3.createImage(304, 34);
				}
				@Pc(71) Graphics local71 = Static333.anImage2.getGraphics();
				local71.setColor(arg5);
				local71.drawRect(0, 0, 303, 33);
				local71.setColor(arg4);
				local71.fillRect(2, 2, arg0 * 3, 30);
				local71.setColor(Color.black);
				local71.drawRect(1, 1, 301, 31);
				local71.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local71.setFont(Static400.aFont1);
				local71.setColor(arg2);
				local71.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local6.drawImage(Static333.anImage2, Static348.anInt6272 / 2 - 152, Static199.anInt3767 / 2 + -18, null);
			} catch (@Pc(151) Exception local151) {
				@Pc(157) int local157 = Static348.anInt6272 / 2 - 152;
				@Pc(163) int local163 = Static199.anInt3767 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local157 + 2, local163 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local157 + 1, local163 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local157 + 2, local163 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static400.aFont1);
				local6.setColor(arg2);
				local6.drawString(arg3, local157 + (304 - arg3.length() * 6) / 2, local163 + 22);
			}
			if (Static71.aString12 != null) {
				local6.setFont(Static400.aFont1);
				local6.setColor(arg2);
				local6.drawString(Static71.aString12, Static348.anInt6272 / 2 - Static71.aString12.length() * 6 / 2, Static199.anInt3767 / 2 + -26);
			}
		} catch (@Pc(270) Exception local270) {
			Static280.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1672(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = Static240.method3701(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}
}
