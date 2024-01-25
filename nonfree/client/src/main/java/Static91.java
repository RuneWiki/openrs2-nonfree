import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray40 = new Rectangle[100];

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!sj;")
	public static Class181 aClass181_16 = null;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!oh;")
	public static Class3_Sub33 aClass3_Sub33_1 = null;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!de;I)V")
	public static void method1444(@OriginalArg(0) Class42 arg0) {
		Static144.anInt2893 = 3;
		Static350.method5692(true);
		Static224.anInt4582 = 127;
		Static228.aBoolean265 = true;
		Static118.aBoolean141 = true;
		Static175.anInt3635 = 0;
		Static271.aBoolean338 = true;
		Static5.aBoolean13 = true;
		Static302.aBoolean410 = true;
		Static135.anInt2792 = 0;
		Static45.anInt930 = 0;
		Static321.anInt6220 = 0;
		Static36.anInt809 = 255;
		Static260.anInt5195 = 127;
		Static352.aBoolean453 = true;
		Static274.aBoolean403 = true;
		Static77.anInt1520 = 2;
		Static33.anInt778 = 1;
		Static149.aBoolean162 = true;
		Static333.aBoolean435 = true;
		Static21.aBoolean29 = true;
		if (Static26.anInt699 < 96) {
			Static243.method4153(0);
		} else {
			Static243.method4153(2);
		}
		Static260.aBoolean302 = true;
		Static226.anInt4626 = 0;
		Static197.anInt4054 = 2;
		Static165.aBoolean173 = false;
		Static250.aBoolean274 = true;
		Static84.anInt1688 = 0;
		Static37.anInt6452 = 2;
		Static250.aBoolean275 = false;
		Static172.aBoolean196 = false;
		@Pc(85) Class39 local85 = null;
		try {
			@Pc(89) Class207 local89 = arg0.method964();
			while (local89.anInt6346 == 0) {
				Static134.method2241(1L);
			}
			if (local89.anInt6346 == 1) {
				local85 = (Class39) local89.anObject7;
				@Pc(113) byte[] local113 = new byte[(int) local85.method899()];
				@Pc(127) int local127;
				for (@Pc(115) int local115 = 0; local115 < local113.length; local115 += local127) {
					local127 = local85.method901(local115, local113.length - local115, local113);
					if (local127 == -1) {
						throw new IOException("EOF");
					}
				}
				Static349.method5665(new Class3_Sub4(local113));
			}
		} catch (@Pc(151) Exception local151) {
		}
		try {
			if (local85 != null) {
				local85.method903();
			}
		} catch (@Pc(158) Exception local158) {
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public static void method1445() {
		@Pc(5) Class198 local5 = Static94.aClass198_18;
		synchronized (Static94.aClass198_18) {
			Static94.aClass198_18.method5243(5);
		}
		local5 = Static164.aClass198_57;
		synchronized (Static164.aClass198_57) {
			Static164.aClass198_57.method5243(5);
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
	public static void method1446() {
		Static291.aClass3_Sub4_Sub2_3.method3682(134);
		Static291.aClass3_Sub4_Sub2_3.method3660(Static214.anInt4356);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1447() {
		if (Static159.aString118.length() != 0) {
			Static104.method1768("--> " + Static159.aString118);
			Static140.method2321(Static159.aString118, false);
			Static3.anInt56 = 0;
			Static159.aString118 = "";
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method1448() {
		Static290.aClass198_53.method5236();
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public static void method1449() {
		Static18.aClass198_7.method5236();
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public static void method1450() {
		@Pc(6) Class198 local6 = Static251.aClass198_47;
		synchronized (Static251.aClass198_47) {
			Static251.aClass198_47.method5230();
		}
		local6 = Static355.aClass198_63;
		synchronized (Static355.aClass198_63) {
			Static355.aClass198_63.method5230();
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
	public static void method1451(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 12);
		local8.method2502();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	public static void method1453() {
		@Pc(1) Class198 local1 = Static251.aClass198_47;
		synchronized (Static251.aClass198_47) {
			Static251.aClass198_47.method5243(5);
		}
		local1 = Static355.aClass198_63;
		synchronized (Static355.aClass198_63) {
			Static355.aClass198_63.method5243(5);
		}
	}
}
