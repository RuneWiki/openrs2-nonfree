import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_26 = new Class244(17, 3);

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
	public static final int[] anIntArray167 = new int[100];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public static void method1395() {
		Static203.anInt3627 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static345.anInt5825; local3++) {
			@Pc(8) Class80 local8 = Static45.aClass80Array1[local3];
			@Pc(12) int local12;
			if (Static359.anIntArray645 != null) {
				for (local12 = 0; local12 < Static359.anIntArray645.length; local12++) {
					if (Static359.anIntArray645[local12] != -1000000 && (local8.anInt1991 <= Static359.anIntArray645[local12] || local8.anInt1982 <= Static359.anIntArray645[local12]) && (local8.anInt1979 <= Static41.anIntArray75[local12] || local8.anInt1996 <= Static41.anIntArray75[local12]) && (local8.anInt1979 >= Static158.anIntArray303[local12] || local8.anInt1996 >= Static158.anIntArray303[local12]) && (local8.anInt1986 <= Static325.anIntArray605[local12] || local8.anInt1985 <= Static325.anIntArray605[local12]) && (local8.anInt1986 >= Static162.anIntArray307[local12] || local8.anInt1985 >= Static162.anIntArray307[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt1990 == 1) {
				local12 = local8.anInt1983 + Static68.anInt1339 - Static12.anInt167;
				if (local12 >= 0 && local12 <= Static68.anInt1339 + Static68.anInt1339) {
					local110 = local8.anInt1981 + Static68.anInt1339 - Static327.anInt5555;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1989 + Static68.anInt1339 - Static327.anInt5555;
					if (local121 > Static68.anInt1339 + Static68.anInt1339) {
						local121 = Static68.anInt1339 + Static68.anInt1339;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static191.aBooleanArrayArray3[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static55.anInt1125 - local8.anInt1979;
						if (local153 > Static258.anInt4652) {
							local8.anInt1995 = 1;
						} else {
							if (local153 >= -Static258.anInt4652) {
								continue;
							}
							local8.anInt1995 = 2;
							local153 = -local153;
						}
						local8.anInt1997 = (local8.anInt1986 - Static303.anInt5264 << 8) / local153;
						local8.anInt1980 = (local8.anInt1985 - Static303.anInt5264 << 8) / local153;
						local8.anInt1984 = (local8.anInt1991 - Static113.anInt2186 << 8) / local153;
						local8.anInt1978 = (local8.anInt1982 - Static113.anInt2186 << 8) / local153;
						Static165.aClass80Array2[Static203.anInt3627++] = local8;
					}
				}
			} else if (local8.anInt1990 == 2) {
				local12 = local8.anInt1981 + Static68.anInt1339 - Static327.anInt5555;
				if (local12 >= 0 && local12 <= Static68.anInt1339 + Static68.anInt1339) {
					local110 = local8.anInt1983 + Static68.anInt1339 - Static12.anInt167;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1987 + Static68.anInt1339 - Static12.anInt167;
					if (local121 > Static68.anInt1339 + Static68.anInt1339) {
						local121 = Static68.anInt1339 + Static68.anInt1339;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static191.aBooleanArrayArray3[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static303.anInt5264 - local8.anInt1986;
						if (local153 > Static258.anInt4652) {
							local8.anInt1995 = 3;
						} else {
							if (local153 >= -Static258.anInt4652) {
								continue;
							}
							local8.anInt1995 = 4;
							local153 = -local153;
						}
						local8.anInt1993 = (local8.anInt1979 - Static55.anInt1125 << 8) / local153;
						local8.anInt1992 = (local8.anInt1996 - Static55.anInt1125 << 8) / local153;
						local8.anInt1984 = (local8.anInt1991 - Static113.anInt2186 << 8) / local153;
						local8.anInt1978 = (local8.anInt1982 - Static113.anInt2186 << 8) / local153;
						Static165.aClass80Array2[Static203.anInt3627++] = local8;
					}
				}
			} else if (local8.anInt1990 == 4) {
				local12 = local8.anInt1991 - Static113.anInt2186;
				if (local12 > Static258.anInt4651) {
					local110 = local8.anInt1981 + Static68.anInt1339 - Static327.anInt5555;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1989 + Static68.anInt1339 - Static327.anInt5555;
					if (local121 > Static68.anInt1339 + Static68.anInt1339) {
						local121 = Static68.anInt1339 + Static68.anInt1339;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt1983 + Static68.anInt1339 - Static12.anInt167;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt1987 + Static68.anInt1339 - Static12.anInt167;
						if (local153 > Static68.anInt1339 + Static68.anInt1339) {
							local153 = Static68.anInt1339 + Static68.anInt1339;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static191.aBooleanArrayArray3[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt1995 = 5;
							local8.anInt1993 = (local8.anInt1979 - Static55.anInt1125 << 8) / local12;
							local8.anInt1992 = (local8.anInt1996 - Static55.anInt1125 << 8) / local12;
							local8.anInt1997 = (local8.anInt1986 - Static303.anInt5264 << 8) / local12;
							local8.anInt1980 = (local8.anInt1985 - Static303.anInt5264 << 8) / local12;
							Static165.aClass80Array2[Static203.anInt3627++] = local8;
						}
					}
				}
			}
		}
	}
}
