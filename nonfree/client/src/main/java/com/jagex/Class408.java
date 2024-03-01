package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public class Class408 {

	@OriginalMember(owner = "client!qj", name = "ck", descriptor = "I")
	static int anInt4816;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 4)
	Class408() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(II)I", line = 9)
	static int method27665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)I", line = 16)
	static int method27663(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "(I)[[[B", line = 22)
	public static byte[][][] method27662(@OriginalArg(0) int arg0) {
		@Pc(3) byte[][][] local3 = new byte[8][4][];
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg0;
		@Pc(12) byte[] local12 = new byte[arg0 * arg0];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		@Pc(21) int local21;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local7; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local14 >= 0 && local14 < local12.length) {
					if (local21 >= local16 << 1) {
						local12[local14] = -1;
					}
					local14++;
				} else {
					local14++;
				}
			}
		}
		local3[1][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 <= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 >= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][3] = local12;
		return local3;
	}

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "(I)[[[B", line = 22)
	public static byte[][][] method27664(@OriginalArg(0) int arg0) {
		@Pc(3) byte[][][] local3 = new byte[8][4][];
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg0;
		@Pc(12) byte[] local12 = new byte[arg0 * arg0];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		@Pc(21) int local21;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local7; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local14 >= 0 && local14 < local12.length) {
					if (local21 >= local16 << 1) {
						local12[local14] = -1;
					}
					local14++;
				} else {
					local14++;
				}
			}
		}
		local3[1][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 <= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 >= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][3] = local12;
		return local3;
	}

	@OriginalMember(owner = "client!qj", name = "hy", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5437)
	static final void method27666(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3513 = -947832406;
		arg0.aClass584_2 = null;
		arg0.anInt3514 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 1702990945;
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!qj", name = "lu", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6084)
	static final void method27667(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.method23437();
	}

	@OriginalMember(owner = "client!qj", name = "acn", descriptor = "(Lclient!vs;B)V", line = 9161)
	static final void method27668(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		if (local17.anInt5493 * 1485423555 >= 0 && local17.anInt5498 * 1166723267 >= 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5498 * 1166723267;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local12;
		}
	}
}
