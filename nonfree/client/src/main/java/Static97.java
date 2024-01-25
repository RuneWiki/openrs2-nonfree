import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Lclient!ov;")
	public static Class226 aClass226_3;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	public static int anInt1968 = 0;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!jj;")
	public static final Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1 = new Class1_Sub6_Sub2(5000);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public static void method1657() {
		if (Static193.aFrame8 != null) {
			return;
		}
		@Pc(14) int local14 = Static81.anInt1466;
		@Pc(16) int local16 = Static376.anInt6875;
		@Pc(24) int local24 = Static399.anInt7190 - local14 - Static83.anInt1567;
		@Pc(30) int local30 = Static128.anInt1835 - Static350.anInt6255 - local16;
		if (local14 <= 0 && local24 <= 0 && local16 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static224.aFrame6 == null) {
				local54 = Static466.aClass102_4.anApplet1;
			} else {
				local54 = Static224.aFrame6;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (Static224.aFrame6 == local54) {
				@Pc(69) Insets local69 = Static224.aFrame6.getInsets();
				local63 = local69.top;
				local61 = local69.left;
			}
			@Pc(78) Graphics local78 = local54.getGraphics();
			local78.setColor(Color.black);
			if (local14 > 0) {
				local78.fillRect(local61, local63, local14, Static128.anInt1835);
			}
			if (local16 > 0) {
				local78.fillRect(local61, local63, Static399.anInt7190, local16);
			}
			if (local24 > 0) {
				local78.fillRect(local61 + Static399.anInt7190 - local24, local63, local24, Static128.anInt1835);
			}
			if (local30 > 0) {
				local78.fillRect(local61, Static128.anInt1835 + local63 - local30, Static399.anInt7190, local30);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}
}
