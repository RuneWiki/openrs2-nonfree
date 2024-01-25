import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!fp", name = "U", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
	public static int anInt2037 = 2;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "[I")
	public static final int[] anIntArray121 = new int[5];

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	public static int anInt2040 = -1;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)Lclient!ri;")
	public static Class8_Sub7 method1655(@OriginalArg(0) int arg0) {
		@Pc(12) Class65[] local12 = Class13.aClass65Array1;
		synchronized (Class13.aClass65Array1) {
			@Pc(35) Class8_Sub7 local35;
			if (arg0 >= Class13.aClass65Array1.length || Class13.aClass65Array1[arg0].method1455()) {
				local35 = new Class8_Sub7();
				local35.aClass8_Sub2Array1 = new Class8_Sub2[arg0];
				for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
					local35.aClass8_Sub2Array1[local57] = new Class8_Sub2();
				}
			} else {
				local35 = (Class8_Sub7) Class13.aClass65Array1[arg0].method1464();
				local35.method4645();
				@Pc(42) int local42 = Static329.anIntArray528[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)V")
	public static void method1656() {
		if (Static322.anInt6236 < 102) {
			Static322.anInt6236 += 6;
		}
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static114.anInt2412; local23++) {
			local29 = Static198.anIntArray340[local23];
			@Pc(34) char local34 = (char) Static223.anIntArray372[local23];
			if (local29 == 84) {
				Static91.method1447();
			} else if (Static192.aBooleanArray19[82] && local29 == 66) {
				if (Static136.aClipboard1 != null) {
					@Pc(210) String local210 = "";
					for (@Pc(215) int local215 = Static265.aStringArray34.length - 1; local215 >= 0; local215--) {
						if (Static265.aStringArray34[local215] != null && Static265.aStringArray34[local215].length() > 0) {
							local210 = local210 + Static265.aStringArray34[local215] + '\n';
						}
					}
					Static136.aClipboard1.setContents(new StringSelection(local210), null);
				}
			} else if (Static192.aBooleanArray19[82] && local29 == 67) {
				if (Static136.aClipboard1 != null) {
					@Pc(63) Transferable local63 = Static136.aClipboard1.getContents(null);
					if (local63 != null) {
						try {
							@Pc(70) String local70 = (String) local63.getTransferData(DataFlavor.stringFlavor);
							if (local70 != null) {
								@Pc(77) String[] local77 = Static159.method2528('\n', local70);
								if (local77.length > 1) {
									for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
										Static159.aString118 = local77[local85];
										Static91.method1447();
									}
								} else {
									Static159.aString118 = Static159.aString118 + local70;
								}
							}
						} catch (@Pc(115) Exception local115) {
						}
					}
				}
			} else if (local29 == 85 && Static159.aString118.length() > 0) {
				Static159.aString118 = Static159.aString118.substring(0, Static159.aString118.length() - 1);
			} else if (local29 == 104 && Static3.anInt56 < Static265.aStringArray34.length) {
				Static3.anInt56++;
				Static130.method2225();
			} else if (local29 == 105 && Static3.anInt56 > 0) {
				Static3.anInt56--;
				Static130.method2225();
			} else if (Static331.method5463(local34) || local34 == ',' || local34 == ' ' || local34 == '_' || local34 == '-' || local34 == '+') {
				Static159.aString118 = Static159.aString118 + (char) Static223.anIntArray372[local23];
			}
		}
		Static114.anInt2412 = 0;
		for (local29 = 0; local29 < 100; local29++) {
			@Pc(274) int local274;
			if (Static236.aBooleanArray23[local29]) {
				local274 = Static9.anIntArray10[local29]++;
				if (Static9.anIntArray10[local29] > 102) {
					Static236.aBooleanArray23[local29] = false;
				}
			} else {
				local274 = Static9.anIntArray10[local29]--;
				if (Static9.anIntArray10[local29] < 0) {
					Static118.anIntArray148[local29] = (int) ((double) Static298.anInt5944 * Math.random());
					Static225.anIntArray435[local29] = (int) (Math.random() * 350.0D);
					Static9.anIntArray10[local29] = 0;
					Static236.aBooleanArray23[local29] = true;
				}
			}
		}
		Static203.method3543();
	}
}
