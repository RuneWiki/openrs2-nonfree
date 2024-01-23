import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gf", name = "ub", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lclient!sf;")
	public static Class157 aClass157_22 = new Class157(20);

	@OriginalMember(owner = "client!gf", name = "qb", descriptor = "I")
	public static int anInt2262 = -2;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II[BILjava/lang/String;I)I")
	public static int method1636(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(25) char local25 = arg3.charAt(local12);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg2 + local12] = (byte) local25;
			} else if (local25 == '€') {
				arg1[arg2 + local12] = -128;
			} else if (local25 == '‚') {
				arg1[arg2 + local12] = -126;
			} else if (local25 == 'ƒ') {
				arg1[arg2 + local12] = -125;
			} else if (local25 == '„') {
				arg1[arg2 + local12] = -124;
			} else if (local25 == '…') {
				arg1[arg2 + local12] = -123;
			} else if (local25 == '†') {
				arg1[arg2 + local12] = -122;
			} else if (local25 == '‡') {
				arg1[local12 + arg2] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg2 + local12] = -120;
			} else if (local25 == '‰') {
				arg1[arg2 + local12] = -119;
			} else if (local25 == 'Š') {
				arg1[local12 + arg2] = -118;
			} else if (local25 == '‹') {
				arg1[arg2 + local12] = -117;
			} else if (local25 == 'Œ') {
				arg1[local12 + arg2] = -116;
			} else if (local25 == 'Ž') {
				arg1[arg2 + local12] = -114;
			} else if (local25 == '‘') {
				arg1[arg2 + local12] = -111;
			} else if (local25 == '’') {
				arg1[local12 + arg2] = -110;
			} else if (local25 == '“') {
				arg1[local12 + arg2] = -109;
			} else if (local25 == '”') {
				arg1[arg2 + local12] = -108;
			} else if (local25 == '•') {
				arg1[local12 + arg2] = -107;
			} else if (local25 == '–') {
				arg1[local12 + arg2] = -106;
			} else if (local25 == '—') {
				arg1[arg2 + local12] = -105;
			} else if (local25 == '˜') {
				arg1[arg2 + local12] = -104;
			} else if (local25 == '™') {
				arg1[local12 + arg2] = -103;
			} else if (local25 == 'š') {
				arg1[local12 + arg2] = -102;
			} else if (local25 == '›') {
				arg1[local12 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg1[local12 + arg2] = -100;
			} else if (local25 == 'ž') {
				arg1[local12 + arg2] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[local12 + arg2] = -97;
			} else {
				arg1[arg2 + local12] = 63;
			}
		}
		return local10;
	}
}
