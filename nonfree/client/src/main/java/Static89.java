import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_906 = Static146.method2172("<img=0>");

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_907 = Static146.method2172("(Z");

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)Lclient!kc;")
	public static Class2_Sub2_Sub13 method1645(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub13 local10 = (Class2_Sub2_Sub13) Static101.aClass82_41.method2699((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static13.aClass43_4.method2205(arg0, 16);
		local10 = new Class2_Sub2_Sub13();
		if (local20 != null) {
			local10.method1513(new Class2_Sub18(local20));
		}
		Static101.aClass82_41.method2701((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1646() {
		aClass77_907 = null;
		aClass77_906 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Color;Lclient!sg;I)V")
	public static void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Class77 arg2) {
		try {
			@Pc(6) Graphics local6 = Static1.aCanvas1.getGraphics();
			if (Static108.aFont1 == null) {
				Static108.aFont1 = new Font("Helvetica", 1, 13);
				Static170.aFontMetrics1 = Static1.aCanvas1.getFontMetrics(Static108.aFont1);
			}
			if (Static158.aBoolean160) {
				Static158.aBoolean160 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static118.anInt2926, Static9.anInt260);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static108.anImage3 == null) {
					Static108.anImage3 = Static1.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static108.anImage3.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static108.aFont1);
				local51.setColor(Color.white);
				arg2.method2512((304 - arg2.method2520(Static170.aFontMetrics1)) / 2, local51, 22);
				local6.drawImage(Static108.anImage3, Static118.anInt2926 / 2 - 152, Static9.anInt260 / 2 + -18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static118.anInt2926 / 2 - 152;
				@Pc(141) int local141 = Static9.anInt260 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local135, local141, 303, 33);
				local6.fillRect(local135 + 2, local141 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local135 + 1, local141 + 1, 301, 31);
				local6.fillRect(local135 + arg0 * 3 + 2, local141 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static108.aFont1);
				local6.setColor(Color.white);
				arg2.method2512(local135 + (304 - arg2.method2520(Static170.aFontMetrics1)) / 2, local6, local141 + 22);
			}
		} catch (@Pc(221) Exception local221) {
			Static1.aCanvas1.repaint();
		}
	}
}
