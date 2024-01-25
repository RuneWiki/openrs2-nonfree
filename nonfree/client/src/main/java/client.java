import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static403.method5823("Argument count");
			}
			Static27.aClass300_1 = new Class300();
			Static27.aClass300_1.anInt7993 = Integer.parseInt(arg0[0]);
			Static549.aClass300_11 = new Class300();
			Static549.aClass300_11.anInt7993 = Integer.parseInt(arg0[1]);
			Static191.aClass300_9 = new Class300();
			Static191.aClass300_9.anInt7993 = Integer.parseInt(arg0[2]);
			Static327.aClass315_8 = Static573.aClass315_9;
			if (arg0[3].equals("live")) {
				Static455.aClass215_1 = Static532.aClass215_2;
			} else if (arg0[3].equals("rc")) {
				Static455.aClass215_1 = Static552.aClass215_3;
			} else if (arg0[3].equals("wip")) {
				Static455.aClass215_1 = Static591.aClass215_4;
			} else {
				Static403.method5823("modewhat");
			}
			Static56.anInt953 = Static142.method2868(arg0[4]);
			if (Static56.anInt953 == -1) {
				if (arg0[4].equals("english")) {
					Static56.anInt953 = 0;
				} else if (arg0[4].equals("german")) {
					Static56.anInt953 = 1;
				} else {
					Static403.method5823("language");
				}
			}
			Static529.aBoolean627 = false;
			Static468.aBoolean196 = false;
			if (arg0[5].equals("game0")) {
				Static538.aClass263_5 = Static379.aClass263_4;
			} else if (arg0[5].equals("game1")) {
				Static538.aClass263_5 = Static27.aClass263_1;
			} else {
				Static403.method5823("game");
			}
			Static431.anInt7395 = 0;
			Static95.anInt9216 = 0;
			Static376.aBoolean498 = false;
			Static248.aString60 = null;
			Static316.aLong165 = 0L;
			Static71.aString16 = "";
			Static37.anInt737 = 0;
			Static58.aBoolean84 = false;
			Static81.aBoolean696 = true;
			Static268.aBoolean388 = true;
			Static248.aString61 = null;
			Static509.anInt8774 = Static538.aClass263_5.anInt6964;
			@Pc(168) client local168 = new client();
			Static81.aClient7 = local168;
			local168.method1212(Static538.aClass263_5.aString80, Static455.aClass215_1.method4790() + 32);
			Static537.aFrame2.setLocation(40, 40);
		} catch (@Pc(191) Exception local191) {
			Static473.method6593(local191, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1202() {
		if (Static403.anInt6994 != 2) {
			this.method1222();
			return;
		}
		try {
			this.method1222();
		} catch (@Pc(20) ThreadDeath local20) {
			throw local20;
		} catch (@Pc(23) Throwable local23) {
			Static473.method6593(local23, local23.getMessage() + " (Recovered) " + this.method1214());
			Static8.method7640(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method1217(@OriginalArg(1) int arg0) {
		Static160.aClass207_1.anInt5473 = arg0;
		Static424.aClass111_2 = null;
		Static521.aClass299_8 = null;
		Static244.anInt4835 = 0;
		Static160.aClass207_1.anInt5474++;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1215() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1204() {
		if (Static55.anApplet1 != null && Static379.aCanvas13 == null) {
			try {
				@Pc(10) Class local10 = Static55.anApplet1.getClass();
				@Pc(14) Field local14 = local10.getDeclaredField("canvas");
				Static379.aCanvas13 = (Canvas) local14.get(Static55.anApplet1);
				local14.set(Static55.anApplet1, null);
				if (Static379.aCanvas13 != null) {
					return;
				}
			} catch (@Pc(27) Exception local27) {
			}
		}
		super.method1204();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1205() {
		if (Static403.anInt6994 != 2) {
			this.method1231();
			return;
		}
		try {
			this.method1231();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static473.method6593(local24, local24.getMessage() + " (Recovered) " + this.method1214());
			Static8.method7640(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1222() {
		if (Static598.anInt9831 == 14) {
			return;
		}
		Static237.anInt7561++;
		if (Static237.anInt7561 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static117.anInt2739 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static285.aRandom1.setSeed((long) Static117.anInt2739);
		}
		if (Static237.anInt7561 % 50 == 0) {
			Static597.anInt9819 = Static44.anInt841;
			Static126.anInt2942 = Static520.anInt8876;
			Static44.anInt841 = 0;
			Static520.anInt8876 = 0;
		}
		this.method1227();
		if (Static96.aClass219_1 != null) {
			Static96.aClass219_1.method4891();
		}
		Static216.method3733();
		Static12.aClass173_1.method6261();
		Static86.aClass50_1.method7105();
		if (Static185.aClass66_14 != null) {
			Static185.aClass66_14.method6824((int) Static184.method3422());
		}
		Static319.method4878();
		Static545.anInt9177 = 0;
		Static176.anInt3771 = 0;
		for (@Pc(91) Interface24 local91 = Static12.aClass173_1.method6260(); local91 != null; local91 = Static12.aClass173_1.method6260()) {
			@Pc(97) int local97 = local91.method6736();
			if (local97 == 2 || local97 == 3) {
				@Pc(107) char local107 = local91.method6735();
				if (Static403.method5821() && (local107 == '`' || local107 == '§')) {
					if (Static252.method4230()) {
						Static99.method2188();
					} else {
						Static318.method4859();
					}
				} else if (Static176.anInt3771 < 128) {
					Static247.anInterface24Array1[Static176.anInt3771] = local91;
					Static176.anInt3771++;
				}
			} else if (local97 == 0 && Static545.anInt9177 < 75) {
				Static365.anInterface24Array2[Static545.anInt9177] = local91;
				Static545.anInt9177++;
			}
		}
		Static551.anInt9250 = 0;
		for (@Pc(170) Class4_Sub22 local170 = Static86.aClass50_1.method7099(); local170 != null; local170 = Static86.aClass50_1.method7099()) {
			@Pc(176) int local176 = local170.method7272();
			if (local176 == -1) {
				Static251.aClass124_24.method3275(local170);
			} else if (local176 == 6) {
				Static551.anInt9250 += local170.method7269();
			} else if (Static3.method53(local176)) {
				Static324.aClass124_28.method3275(local170);
				if (Static324.aClass124_28.method3271() > 10) {
					Static324.aClass124_28.method3272();
				}
			}
		}
		if (Static252.method4230()) {
			Static463.method6489();
		}
		if (Static388.method5709(Static598.anInt9831)) {
			Static539.method7485();
			Static437.method6207();
		} else if (Static308.method4764(Static598.anInt9831)) {
			Static400.method5800();
		}
		if (Static440.method6236(Static598.anInt9831) && !Static308.method4764(Static598.anInt9831)) {
			this.method1232();
			Static183.method3407();
			Static59.method862();
		} else if (Static69.method1224(Static598.anInt9831) && !Static308.method4764(Static598.anInt9831)) {
			this.method1232();
			Static59.method862();
		} else if (Static598.anInt9831 == 12) {
			Static59.method862();
		} else if (Static259.method4294(Static598.anInt9831) && !Static308.method4764(Static598.anInt9831)) {
			Static373.method5590();
		} else if (Static598.anInt9831 == 13) {
			Static59.method862();
			if (Static341.anInt5984 != -3 && Static341.anInt5984 != 2 && Static341.anInt5984 != 15) {
				Static362.method5445(false);
			}
		}
		Static515.method7278(Static185.aClass66_14);
		Static324.aClass124_28.method3272();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1207() {
		if (Static195.aBoolean312) {
			Static388.method5705();
		}
		Static470.method6547();
		if (Static185.aClass66_14 != null) {
			Static185.aClass66_14.method6838();
		}
		if (Static528.aFrame1 != null) {
			Static159.method3159(Static528.aFrame1, Static147.aClass161_4);
			Static528.aFrame1 = null;
		}
		if (Static235.aClass45_1 != null) {
			Static235.aClass45_1.method839();
			Static235.aClass45_1 = null;
		}
		Static61.method1047();
		Static160.aClass207_1.method4641();
		Static340.aClass70_2.method2056();
		if (Static528.aClass348_1 != null) {
			Static528.aClass348_1.method7775();
			Static528.aClass348_1 = null;
		}
		try {
			Static454.aClass56_5.method1126();
			for (@Pc(51) int local51 = 0; local51 < 35; local51++) {
				Static566.aClass56Array1[local51].method1126();
			}
			Static146.aClass56_3.method1126();
			Static268.aClass56_4.method1126();
		} catch (@Pc(77) Exception local77) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1226() {
		if (Static12.anInt230 < Static160.aClass207_1.anInt5474) {
			Static238.aClass300_10.method6607();
			Static553.anInt9268 = (Static160.aClass207_1.anInt5474 * 50 - 50) * 5;
			if (Static553.anInt9268 > 3000) {
				Static553.anInt9268 = 3000;
			}
			if (Static160.aClass207_1.anInt5474 >= 2 && Static160.aClass207_1.anInt5473 == 6) {
				this.method1208("js5connect_outofdate");
				Static598.anInt9831 = 14;
				return;
			}
			if (Static160.aClass207_1.anInt5474 >= 4 && Static160.aClass207_1.anInt5473 == -1) {
				this.method1208("js5crc");
				Static598.anInt9831 = 14;
				return;
			}
			if (Static160.aClass207_1.anInt5474 >= 4 && Static388.method5709(Static598.anInt9831)) {
				if (Static160.aClass207_1.anInt5473 == 7 || Static160.aClass207_1.anInt5473 == 9) {
					this.method1208("js5connect_full");
				} else if (Static160.aClass207_1.anInt5473 <= 0) {
					this.method1208("js5io");
				} else if (Static319.aString70 == null) {
					this.method1208("js5connect");
				} else {
					this.method1208("js5proxy_" + Static319.aString70.trim());
				}
				Static598.anInt9831 = 14;
				return;
			}
		}
		Static12.anInt230 = Static160.aClass207_1.anInt5474;
		if (Static553.anInt9268 > 0) {
			Static553.anInt9268--;
			return;
		}
		try {
			if (Static244.anInt4835 == 0) {
				Static521.aClass299_8 = Static238.aClass300_10.method6606(Static147.aClass161_4);
				Static244.anInt4835++;
			}
			if (Static244.anInt4835 == 1) {
				if (Static521.aClass299_8.anInt7985 == 2) {
					if (Static521.aClass299_8.anObject41 != null) {
						Static319.aString70 = (String) Static521.aClass299_8.anObject41;
					}
					this.method1217(1000);
					return;
				}
				if (Static521.aClass299_8.anInt7985 == 1) {
					Static244.anInt4835++;
				}
			}
			if (Static244.anInt4835 == 2) {
				Static424.aClass111_2 = new Class111((Socket) Static521.aClass299_8.anObject41, Static147.aClass161_4);
				@Pc(197) Class4_Sub9 local197 = new Class4_Sub9(5);
				local197.method5961(-345277664, Static581.aClass118_2.anInt3562);
				local197.method5963(617);
				Static424.aClass111_2.method3085(local197.aByteArray97, 5);
				Static244.anInt4835++;
				Static399.aLong205 = Static184.method3422();
			}
			if (Static244.anInt4835 == 3) {
				if (Static388.method5709(Static598.anInt9831) || Static424.aClass111_2.method3088() > 0) {
					@Pc(252) int local252 = Static424.aClass111_2.method3091();
					if (local252 != 0) {
						this.method1217(local252);
						return;
					}
					Static244.anInt4835++;
				} else if (Static184.method3422() - Static399.aLong205 > 30000L) {
					this.method1217(1001);
					return;
				}
			}
			if (Static244.anInt4835 == 4) {
				@Pc(284) boolean local284 = Static388.method5709(Static598.anInt9831) || Static440.method6236(Static598.anInt9831) || Static69.method1224(Static598.anInt9831);
				@Pc(287) Class158[] local287 = Static217.method3739();
				@Pc(295) Class4_Sub9 local295 = new Class4_Sub9(local287.length * 4);
				Static424.aClass111_2.method3084(local295.aByteArray97.length, local295.aByteArray97, 0);
				for (@Pc(306) int local306 = 0; local306 < local287.length; local306++) {
					local287[local306].method3738(local295.method6026());
				}
				Static160.aClass207_1.method4627(Static424.aClass111_2, !local284);
				Static521.aClass299_8 = null;
				Static424.aClass111_2 = null;
				Static244.anInt4835 = 0;
			}
		} catch (@Pc(338) IOException local338) {
			this.method1217(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1209() {
		if (Static58.aBoolean84) {
			Static87.anInt2262 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static396.method5781();
		Static340.aClass70_2 = new Class70(Static147.aClass161_4);
		Static160.aClass207_1 = new Class207();
		Static104.method2288(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static327.aClass315_8 != Static106.aClass315_4) {
			Static240.aByteArrayArray22 = new byte[50][];
		}
		Static189.aClass4_Sub2_Sub1_1 = new Class4_Sub2_Sub1(Static147.aClass161_4);
		if (Static327.aClass315_8 == Static106.aClass315_4) {
			Static27.aClass300_1.aString89 = this.getCodeBase().getHost();
		} else if (Static353.method5226(Static327.aClass315_8)) {
			Static27.aClass300_1.aString89 = this.getCodeBase().getHost();
			Static27.aClass300_1.anInt7995 = Static27.aClass300_1.anInt7993 + 40000;
			Static549.aClass300_11.anInt7995 = Static549.aClass300_11.anInt7993 + 40000;
			Static27.aClass300_1.anInt7994 = Static27.aClass300_1.anInt7993 + 50000;
			Static191.aClass300_9.anInt7995 = Static191.aClass300_9.anInt7993 + 40000;
			Static549.aClass300_11.anInt7994 = Static549.aClass300_11.anInt7993 + 50000;
			Static191.aClass300_9.anInt7994 = Static191.aClass300_9.anInt7993 + 50000;
		} else if (Static327.aClass315_8 == Static573.aClass315_9) {
			Static27.aClass300_1.aString89 = "127.0.0.1";
			Static549.aClass300_11.aString89 = "127.0.0.1";
			Static191.aClass300_9.aString89 = "127.0.0.1";
			Static27.aClass300_1.anInt7995 = Static27.aClass300_1.anInt7993 + 40000;
			Static549.aClass300_11.anInt7995 = Static549.aClass300_11.anInt7993 + 40000;
			Static27.aClass300_1.anInt7994 = Static27.aClass300_1.anInt7993 + 50000;
			Static191.aClass300_9.anInt7995 = Static191.aClass300_9.anInt7993 + 40000;
			Static549.aClass300_11.anInt7994 = Static549.aClass300_11.anInt7993 + 50000;
			Static191.aClass300_9.anInt7994 = Static191.aClass300_9.anInt7993 + 50000;
		}
		if (Static27.aClass263_1 == Static538.aClass263_5) {
			Static307.aBoolean423 = true;
			Static356.aShortArrayArray36 = Static165.aShortArrayArray14;
			Static436.anInt7484 = 0;
			Static121.anInt7239 = 16777215;
			Static296.aShortArrayArrayArray2 = Static346.aShortArrayArrayArray3;
		} else {
			Static356.aShortArrayArray36 = Static241.aShortArrayArray20;
			Static296.aShortArrayArrayArray2 = Static118.aShortArrayArrayArray1;
		}
		if (Static538.aClass263_5 == Static379.aClass263_4) {
			Static297.aBoolean412 = false;
		}
		Static238.aClass300_10 = Static27.aClass300_1;
		Static252.aShortArray90 = Static421.aShortArray155 = Static389.aShortArray114 = Static11.aShortArray15 = new short[256];
		try {
			Static168.aClipboard1 = Static81.aClient7.getToolkit().getSystemClipboard();
		} catch (@Pc(211) Exception local211) {
		}
		Static12.aClass173_1 = Static593.method7990(Static379.aCanvas13);
		Static86.aClass50_1 = Static594.method7993(Static379.aCanvas13);
		try {
			if (Static147.aClass161_4.aClass23_4 != null) {
				Static454.aClass56_5 = new Class56(Static147.aClass161_4.aClass23_4, 5200, 0);
				for (@Pc(233) int local233 = 0; local233 < 35; local233++) {
					Static566.aClass56Array1[local233] = new Class56(Static147.aClass161_4.aClass23Array1[local233], 6000, 0);
				}
				Static146.aClass56_3 = new Class56(Static147.aClass161_4.aClass23_2, 6000, 0);
				Static309.aClass47_2 = new Class47(255, Static454.aClass56_5, Static146.aClass56_3, 500000);
				Static268.aClass56_4 = new Class56(Static147.aClass161_4.aClass23_3, 24, 0);
				Static147.aClass161_4.aClass23_4 = null;
				Static147.aClass161_4.aClass23_3 = null;
				Static147.aClass161_4.aClass23_2 = null;
				Static147.aClass161_4.aClass23Array1 = null;
			}
		} catch (@Pc(291) IOException local291) {
			Static454.aClass56_5 = null;
			Static146.aClass56_3 = null;
			Static268.aClass56_4 = null;
			Static309.aClass47_2 = null;
		}
		if (Static327.aClass315_8 != Static106.aClass315_4) {
			Static596.aBoolean689 = true;
		}
		if (Static379.aClass263_4 == Static538.aClass263_5) {
			Static121.aString83 = Static275.aClass198_1.method4407(Static56.anInt953);
		} else if (Static27.aClass263_1 == Static538.aClass263_5) {
			Static121.aString83 = Static275.aClass198_2.method4407(Static56.anInt953);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method1227() {
		@Pc(12) boolean local12 = Static160.aClass207_1.method4638();
		if (!local12) {
			this.method1226();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1231() {
		if (Static598.anInt9831 == 14) {
			return;
		}
		@Pc(19) long local19 = Static137.method2818() / 1000000L - Static256.aLong139;
		Static256.aLong139 = Static137.method2818() / 1000000L;
		@Pc(27) boolean local27 = Static446.method6287();
		if (local27 && Static327.aBoolean615 && Static4.aClass303_1 != null) {
			Static4.aClass303_1.method7978();
		}
		if (Static393.method7816(Static598.anInt9831)) {
			if (Static252.aLong136 != 0L && Static184.method3422() > Static252.aLong136) {
				Static469.method6545(Static420.method6044(), Static189.aClass4_Sub2_Sub1_1.anInt9296, Static189.aClass4_Sub2_Sub1_1.anInt9305, false);
			} else if (!Static185.aClass66_14.method6828() && Static118.aBoolean222) {
				Static382.method5666();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static528.aFrame1 == null) {
			@Pc(77) Container local77;
			if (Static537.aFrame2 != null) {
				local77 = Static537.aFrame2;
			} else if (Static55.anApplet1 == null) {
				local77 = Static31.anApplet_Sub1_1;
			} else {
				local77 = Static55.anApplet1;
			}
			local89 = local77.getSize().width;
			local93 = local77.getSize().height;
			if (Static537.aFrame2 == local77) {
				@Pc(99) Insets local99 = Static537.aFrame2.getInsets();
				local93 -= local99.top + local99.bottom;
				local89 -= local99.left + local99.right;
			}
			if (Static376.anInt6720 != local89 || local93 != Static86.anInt2256 || Static179.aBoolean296) {
				if (Static185.aClass66_14 == null || Static185.aClass66_14.method6793()) {
					Static396.method5781();
				} else {
					Static86.anInt2256 = local93;
					Static376.anInt6720 = local89;
				}
				Static252.aLong136 = Static184.method3422() + 500L;
				Static179.aBoolean296 = false;
			}
		}
		if (Static528.aFrame1 != null && !Static340.aBoolean446 && Static393.method7816(Static598.anInt9831)) {
			Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
		}
		@Pc(167) boolean local167 = false;
		if (Static493.aBoolean599) {
			Static493.aBoolean599 = false;
			local167 = true;
		}
		if (local167) {
			Static485.method6744();
		}
		if (Static185.aClass66_14 != null && Static185.aClass66_14.method6828() || Static420.method6044() != 1) {
			Static39.method670();
		}
		if (Static388.method5709(Static598.anInt9831)) {
			Static3.method57(local167);
		} else if (Static328.method4934(Static598.anInt9831)) {
			Static238.method7143();
		} else if (Static354.method5232(Static598.anInt9831)) {
			Static238.method7143();
		} else if (Static308.method4764(Static598.anInt9831)) {
			if (Static505.anInt8749 == 1) {
				if (Static483.anInt8144 > Static383.anInt6777) {
					Static383.anInt6777 = Static483.anInt8144;
				}
				local89 = (Static383.anInt6777 - Static483.anInt8144) * 50 / Static383.anInt6777;
				Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953) + "<br>(" + local89 + "%)", true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
			} else if (Static505.anInt8749 == 2) {
				if (Static407.anInt7051 > Static180.anInt3829) {
					Static180.anInt3829 = Static407.anInt7051;
				}
				local89 = (Static180.anInt3829 - Static407.anInt7051) * 50 / Static180.anInt3829 + 50;
				Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953) + "<br>(" + local89 + "%)", true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
			} else {
				Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953), true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
			}
		} else if (Static598.anInt9831 == 10) {
			Static230.method3992(local19);
		} else if (Static598.anInt9831 == 13) {
			Static433.method6141(Static275.aClass198_13.method4407(Static56.anInt953) + "<br>" + Static275.aClass198_14.method4407(Static56.anInt953), true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
		}
		if (Static435.anInt7463 == 3) {
			for (local89 = 0; local89 < Static433.anInt7419; local89++) {
				@Pc(362) Rectangle local362 = Class63_Sub1.aRectangleArray4[local89];
				if (Static231.aBooleanArray19[local89]) {
					Static185.aClass66_14.method6794(local362.width, local362.x, local362.height, local362.y, -1996553985);
				} else if (Static424.aBooleanArray30[local89]) {
					Static185.aClass66_14.method6794(local362.width, local362.x, local362.height, local362.y, -1996554240);
				}
			}
		}
		if (Static252.method4230()) {
			Static433.method6144(Static185.aClass66_14);
		}
		if (Static147.aClass161_4.aBoolean345 && Static393.method7816(Static598.anInt9831) && Static435.anInt7463 == 0 && Static420.method6044() == 1 && !local167) {
			local89 = 0;
			for (local93 = 0; local93 < Static433.anInt7419; local93++) {
				if (Static424.aBooleanArray30[local93]) {
					Static424.aBooleanArray30[local93] = false;
					Static131.aRectangleArray3[local89++] = Class63_Sub1.aRectangleArray4[local93];
				}
			}
			try {
				Static185.aClass66_14.method6812(Static131.aRectangleArray3, local89);
			} catch (@Pc(506) Exception_Sub1 local506) {
			}
		} else if (!Static388.method5709(Static598.anInt9831)) {
			for (local89 = 0; local89 < Static433.anInt7419; local89++) {
				Static424.aBooleanArray30[local89] = false;
			}
			try {
				Static185.aClass66_14.method6847();
			} catch (@Pc(450) Exception_Sub1 local450) {
				Static473.method6593(local450, local450.getMessage() + " (Recovered) " + this.method1214());
				Static8.method7640(0);
			}
		}
		if (Static189.aClass4_Sub2_Sub1_1.anInt9300 == 0) {
			Static55.method845(15L);
		} else if (Static189.aClass4_Sub2_Sub1_1.anInt9300 == 1) {
			Static55.method845(10L);
		} else if (Static189.aClass4_Sub2_Sub1_1.anInt9300 == 2) {
			Static55.method845(5L);
		} else if (Static189.aClass4_Sub2_Sub1_1.anInt9300 == 3) {
			Static55.method845(2L);
		}
		if (Static121.aBoolean522) {
			Static257.method4281();
		}
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean659 && Static598.anInt9831 == 3 && Static249.anInt4945 != -1) {
			Static189.aClass4_Sub2_Sub1_1.aBoolean659 = false;
			Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1232() {
		@Pc(29) int local29;
		if (Static598.anInt9831 == 7 && Static81.anInt9842 == 0) {
			if (Static72.anInt1537 > 1) {
				Static204.anInt4280 = Static191.anInt5895;
				Static72.anInt1537--;
			}
			if (!Static325.aBoolean431) {
				Static161.method3169();
			}
			for (local29 = 0; local29 < 100 && Static244.method4131(); local29++) {
			}
		}
		Static426.anInt7338++;
		Static501.method7139(null, -1, -1);
		Static387.method7906(null, -1, -1);
		Static429.method6117();
		Static191.anInt5895++;
		for (local29 = 0; local29 < Static566.anInt9466; local29++) {
			@Pc(71) Class10_Sub1_Sub2_Sub1 local71 = Static161.aClass4_Sub50Array1[local29].aClass10_Sub1_Sub2_Sub1_1;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass54_1.aByte20;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method7021();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt8537 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(131) int local131 = local109 + local71.anIntArray653[0];
							if (local131 < 0) {
								local131 = 0;
							} else if (Static38.anInt740 - local85 - 1 < local131) {
								local131 = Static38.anInt740 - local85 - 1;
							}
							@Pc(159) int local159 = local117 + local71.anIntArray654[0];
							if (local159 < 0) {
								local159 = 0;
							} else if (Static38.anInt741 - local85 - 1 < local159) {
								local159 = Static38.anInt741 - local85 - 1;
							}
							@Pc(210) int local210 = Static208.method3673(local71.anIntArray653[0], local85, local131, true, local71.anIntArray654[0], 0, Static15.aClass84Array1[local71.aByte101], local85, 0, local159, local85, -1, Static475.anIntArray637, Static556.anIntArray591);
							if (local210 > 0) {
								if (local210 > 9) {
									local210 = 9;
								}
								for (@Pc(224) int local224 = 0; local224 < local210; local224++) {
									local71.anIntArray653[local224] = Static556.anIntArray591[local210 - local224 - 1];
									local71.anIntArray654[local224] = Static475.anIntArray637[local210 - local224 - 1];
									local71.aByteArray107[local224] = 1;
								}
								local71.anInt8537 = local210;
							}
						}
					}
					Static497.method7072(true, local71);
					local109 = Static450.method6351(local71);
					Static463.method6487(Static351.anInt6124, local71, Static466.anInt7863, local109);
					Static551.method7606(local71, Static466.anInt7863);
					Static353.method5229(local71);
				}
			}
		}
		if (Static81.anInt9842 == 0 && Static430.anInt7383 == 0) {
			if (Static555.anInt9335 == 2) {
				Static236.method4045();
			} else {
				Static548.method7572();
			}
			if (Static473.anInt7978 >> 9 < 14 || Static38.anInt740 - 14 <= Static473.anInt7978 >> 9 || Static563.anInt9436 >> 9 < 14 || Static563.anInt9436 >> 9 >= Static38.anInt741 - 14) {
				Static391.method5719();
			}
		}
		while (true) {
			@Pc(345) Class4_Sub12 local345;
			@Pc(350) Class115 local350;
			@Pc(361) Class115 local361;
			do {
				local345 = (Class4_Sub12) Static413.aClass124_45.method3272();
				if (local345 == null) {
					while (true) {
						do {
							local345 = (Class4_Sub12) Static436.aClass124_46.method3272();
							if (local345 == null) {
								while (true) {
									do {
										local345 = (Class4_Sub12) Static577.aClass124_67.method3272();
										if (local345 == null) {
											if (Static287.aClass115_12 != null) {
												Static160.method3165();
											}
											if (Static237.anInt7561 % 1500 == 0) {
												Static525.method7327();
											}
											if (Static598.anInt9831 == 7 && Static81.anInt9842 == 0) {
												Static221.method3809();
											}
											Static217.method3740();
											if (Static195.aBoolean312 && Static184.method3422() - 60000L > Static439.aLong296) {
												Static388.method5705();
											}
											for (@Pc(520) Class26_Sub1_Sub2 local520 = (Class26_Sub1_Sub2) Static259.aClass8_3.method110(); local520 != null; local520 = (Class26_Sub1_Sub2) Static259.aClass8_3.method113()) {
												if (Static184.method3422() / 1000L - 5L > (long) local520.anInt6645) {
													if (local520.aShort89 > 0) {
														Static410.method5899("", "", local520.aString78 + Static275.aClass198_18.method4407(Static56.anInt953), 5, "", 0);
													}
													if (local520.aShort89 == 0) {
														Static410.method5899("", "", local520.aString78 + Static275.aClass198_19.method4407(Static56.anInt953), 5, "", 0);
													}
													local520.method7575();
												}
											}
											if (Static598.anInt9831 == 7 && Static81.anInt9842 == 0) {
												if (Static235.aClass45_1 == null) {
													Static362.method5445(false);
													return;
												}
												Static248.anInt4940++;
												if (Static248.anInt4940 > 50) {
													@Pc(629) Class4_Sub41 local629 = Static128.method2707(Static174.aClass61_42, Class16_Sub3.lb);
													Static551.method7603(local629);
												}
												try {
													Static315.method4803();
													return;
												} catch (@Pc(636) IOException local636) {
													Static362.method5445(false);
													return;
												}
											}
											return;
										}
										local350 = local345.aClass115_5;
										if (local350.anInt3517 < 0) {
											break;
										}
										local361 = Static92.method2118(local350.anInt3441);
									} while (local361 == null || local361.aClass115Array1 == null || local350.anInt3517 >= local361.aClass115Array1.length || local350 != local361.aClass115Array1[local350.anInt3517]);
									Static205.method3636(local345);
								}
							}
							local350 = local345.aClass115_5;
							if (local350.anInt3517 < 0) {
								break;
							}
							local361 = Static92.method2118(local350.anInt3441);
						} while (local361 == null || local361.aClass115Array1 == null || local361.aClass115Array1.length <= local350.anInt3517 || local350 != local361.aClass115Array1[local350.anInt3517]);
						Static205.method3636(local345);
					}
				}
				local350 = local345.aClass115_5;
				if (local350.anInt3517 < 0) {
					break;
				}
				local361 = Static92.method2118(local350.anInt3441);
			} while (local361 == null || local361.aClass115Array1 == null || local350.anInt3517 >= local361.aClass115Array1.length || local361.aClass115Array1[local350.anInt3517] != local350);
			Static205.method3636(local345);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1199()) {
			return;
		}
		Static27.aClass300_1 = new Class300();
		Static27.aClass300_1.anInt7993 = Integer.parseInt(this.getParameter("worldid"));
		Static549.aClass300_11 = new Class300();
		Static549.aClass300_11.anInt7993 = Integer.parseInt(this.getParameter("lobbyid"));
		Static549.aClass300_11.aString89 = this.getParameter("lobbyaddress");
		Static191.aClass300_9 = new Class300();
		Static191.aClass300_9.anInt7993 = Integer.parseInt(this.getParameter("demoid"));
		Static191.aClass300_9.aString89 = this.getParameter("demoaddress");
		Static327.aClass315_8 = Static253.method4247(Integer.parseInt(this.getParameter("modewhere")));
		if (Static327.aClass315_8 == Static573.aClass315_9) {
			Static327.aClass315_8 = Static463.aClass315_7;
		} else if (!Static353.method5226(Static327.aClass315_8) && Static327.aClass315_8 != Static106.aClass315_4) {
			Static327.aClass315_8 = Static106.aClass315_4;
		}
		Static455.aClass215_1 = Static289.method4563(Integer.parseInt(this.getParameter("modewhat")));
		if (Static591.aClass215_4 != Static455.aClass215_1 && Static552.aClass215_3 != Static455.aClass215_1 && Static455.aClass215_1 != Static532.aClass215_2) {
			Static455.aClass215_1 = Static532.aClass215_2;
		}
		try {
			Static56.anInt953 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static56.anInt953 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static468.aBoolean196 = true;
		} else {
			Static468.aBoolean196 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static529.aBoolean627 = true;
		} else {
			Static529.aBoolean627 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static350.aBoolean456 = true;
		} else {
			Static350.aBoolean456 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static538.aClass263_5 = Static379.aClass263_4;
			} else if (local152.equals("1")) {
				Static538.aClass263_5 = Static27.aClass263_1;
			}
		}
		try {
			Static431.anInt7395 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static431.anInt7395 = 0;
		}
		Static21.aString6 = this.getParameter("quiturl");
		Static71.aString16 = this.getParameter("settings");
		if (Static71.aString16 == null) {
			Static71.aString16 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static95.anInt9216 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static95.anInt9216 = 0;
			}
		}
		Static509.anInt8774 = Integer.parseInt(this.getParameter("colourid"));
		if (Static509.anInt8774 < 0 || Static509.anInt8774 >= Static92.aColorArray2.length) {
			Static509.anInt8774 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static81.aBoolean696 = true;
			Static268.aBoolean388 = true;
		}
		@Pc(233) String local233 = this.getParameter("frombilling");
		if (local233 != null && local233.equals("true")) {
			Static376.aBoolean498 = true;
		}
		Static248.aString61 = this.getParameter("sskey");
		if (Static248.aString61 != null && Static248.aString61.length() < 2) {
			Static248.aString61 = null;
		}
		@Pc(259) String local259 = this.getParameter("force64mb");
		if (local259 != null && local259.equals("true")) {
			Static58.aBoolean84 = true;
		}
		@Pc(271) String local271 = this.getParameter("worldflags");
		if (local271 != null) {
			try {
				Static37.anInt737 = Integer.parseInt(local271);
			} catch (@Pc(278) Exception local278) {
			}
		}
		@Pc(283) String local283 = this.getParameter("userFlow");
		if (local283 != null) {
			try {
				Static316.aLong165 = Long.parseLong(local283);
			} catch (@Pc(290) NumberFormatException local290) {
			}
		}
		Static248.aString60 = this.getParameter("additionalInfo");
		if (Static248.aString60 != null && Static248.aString60.length() > 50) {
			Static248.aString60 = null;
		}
		if (Static538.aClass263_5 == Static379.aClass263_4) {
			Static576.anInt9547 = 503;
			Static9.anInt8933 = 765;
		} else if (Static538.aClass263_5 == Static27.aClass263_1) {
			Static9.anInt8933 = 640;
			Static576.anInt9547 = 480;
		}
		Static81.aClient7 = this;
		this.method1206(Static455.aClass215_1.method4790() + 32, Static576.anInt9547, Static9.anInt8933, Static538.aClass263_5.aString80);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1214() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static373.anInt6695 + "," + Static6.anInt97 + "," + Static38.anInt740 + "," + Static38.anInt741 + "|";
			if (Static129.aClass10_Sub1_Sub2_Sub2_1 != null) {
				local7 = local7 + "2)" + Static320.anInt5748 + "," + (Static373.anInt6695 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0]) + "," + (Static6.anInt97 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0]) + "|";
			}
			local7 = local7 + "3)" + Static403.anInt6994 + "|4)" + Static189.aClass4_Sub2_Sub1_1.anInt9297 + "|5)" + Static420.method6044() + "|6)" + Static2.anInt29 + "," + Static19.anInt390 + "|";
			local7 = local7 + "7)" + Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994) + "|";
			local7 = local7 + "8)" + Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) + "|";
			local7 = local7 + "9)" + Static189.aClass4_Sub2_Sub1_1.aBoolean648 + "|";
			local7 = local7 + "10)" + Static189.aClass4_Sub2_Sub1_1.aBoolean661 + "|";
			local7 = local7 + "11)" + Static189.aClass4_Sub2_Sub1_1.aBoolean645 + "|";
			local7 = local7 + "12)" + Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994) + "|";
			local7 = local7 + "13)" + Static87.anInt2262 + "|";
			local7 = local7 + "14)" + Static598.anInt9831;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(224) Throwable local224) {
			}
			try {
				if (Static403.anInt6994 == 2) {
					@Pc(232) Class local232 = Class.forName("java.lang.ClassLoader");
					@Pc(236) Field local236 = local232.getDeclaredField("nativeLibraries");
					@Pc(239) Class local239 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(249) Method local249 = local239.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local249.invoke(local236, Boolean.TRUE);
					@Pc(272) Vector local272 = (Vector) local236.get(client.class.getClassLoader());
					for (@Pc(274) int local274 = 0; local272.size() > local274; local274++) {
						try {
							@Pc(280) Object local280 = local272.elementAt(local274);
							@Pc(285) Field local285 = local280.getClass().getDeclaredField("name");
							local249.invoke(local285, Boolean.TRUE);
							try {
								@Pc(300) String local300 = (String) local285.get(local280);
								if (local300 != null && local300.indexOf("sw3d.dll") != -1) {
									@Pc(313) Field local313 = local280.getClass().getDeclaredField("handle");
									local249.invoke(local313, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local313.getLong(local280));
									local249.invoke(local313, Boolean.FALSE);
								}
							} catch (@Pc(349) Throwable local349) {
							}
							local249.invoke(local285, Boolean.FALSE);
						} catch (@Pc(361) Throwable local361) {
						}
					}
				}
			} catch (@Pc(369) Throwable local369) {
			}
			local7 = local7 + "]";
		} catch (@Pc(387) Throwable local387) {
		}
		return local7;
	}
}
