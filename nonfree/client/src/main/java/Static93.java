import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_24 = new Class21("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_28 = new Class212(26, 16);

	@OriginalMember(owner = "client!en", name = "f", descriptor = "I")
	public static int anInt2064 = 0;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!kj;")
	public static final Class131 aClass131_3 = new Class131("", 14);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BLjava/lang/String;BII)I")
	public static int method1824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3) {
		@Pc(14) int local14 = arg3;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) char local24 = arg2.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg1[arg0 + local16] = (byte) local24;
			} else if (local24 == '€') {
				arg1[arg0 + local16] = -128;
			} else if (local24 == '‚') {
				arg1[arg0 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg1[arg0 + local16] = -125;
			} else if (local24 == '„') {
				arg1[local16 + arg0] = -124;
			} else if (local24 == '…') {
				arg1[local16 + arg0] = -123;
			} else if (local24 == '†') {
				arg1[arg0 + local16] = -122;
			} else if (local24 == '‡') {
				arg1[local16 + arg0] = -121;
			} else if (local24 == 'ˆ') {
				arg1[local16 + arg0] = -120;
			} else if (local24 == '‰') {
				arg1[arg0 + local16] = -119;
			} else if (local24 == 'Š') {
				arg1[arg0 + local16] = -118;
			} else if (local24 == '‹') {
				arg1[local16 + arg0] = -117;
			} else if (local24 == 'Œ') {
				arg1[arg0 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg1[local16 + arg0] = -114;
			} else if (local24 == '‘') {
				arg1[arg0 + local16] = -111;
			} else if (local24 == '’') {
				arg1[arg0 + local16] = -110;
			} else if (local24 == '“') {
				arg1[local16 + arg0] = -109;
			} else if (local24 == '”') {
				arg1[local16 + arg0] = -108;
			} else if (local24 == '•') {
				arg1[arg0 + local16] = -107;
			} else if (local24 == '–') {
				arg1[local16 + arg0] = -106;
			} else if (local24 == '—') {
				arg1[arg0 + local16] = -105;
			} else if (local24 == '˜') {
				arg1[local16 + arg0] = -104;
			} else if (local24 == '™') {
				arg1[local16 + arg0] = -103;
			} else if (local24 == 'š') {
				arg1[arg0 + local16] = -102;
			} else if (local24 == '›') {
				arg1[arg0 + local16] = -101;
			} else if (local24 == 'œ') {
				arg1[arg0 + local16] = -100;
			} else if (local24 == 'ž') {
				arg1[arg0 + local16] = -98;
			} else if (local24 == 'Ÿ') {
				arg1[local16 + arg0] = -97;
			} else {
				arg1[local16 + arg0] = 63;
			}
		}
		return local14;
	}
}
