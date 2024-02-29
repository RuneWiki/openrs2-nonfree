package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afx")
public class Class96_Sub19 extends Class96 {

	@OriginalMember(owner = "client!afx", name = "c", descriptor = "I")
	final int anInt929;

	@OriginalMember(owner = "client!afx", name = "y", descriptor = "[I")
	final int[] anIntArray103;

	@OriginalMember(owner = "client!afx", name = "v", descriptor = "I")
	final int anInt931;

	@OriginalMember(owner = "client!afx", name = "l", descriptor = "I")
	final int anInt930;

	@OriginalMember(owner = "client!afx", name = "<init>", descriptor = "(Lclient!akv;)V", line = 17)
	Class96_Sub19(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt929 = arg0.method22483() * 2109152377;
		this.anIntArray103 = new int[4];
		this.anInt931 = arg0.method22549() * -1813692921;
		Arrays.fill(this.anIntArray103, 0, this.anIntArray103.length, this.anInt931 * -1744842825);
		this.anInt930 = arg0.method22500() * -539985523;
	}

	@OriginalMember(owner = "client!afx", name = "v", descriptor = "(II)[[[B", line = 22)
	public static byte[][][] method7726(@OriginalArg(0) int arg0) {
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local5 * local7];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local7 * local5];
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
		local12 = new byte[local7 * local5];
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

	@OriginalMember(owner = "client!afx", name = "y", descriptor = "()V", line = 26)
	@Override
	public void method19912() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt929 * 2045545929].method25755();
		if (this.anInt930 * -1245155003 == 0) {
			Class96_Sub5.method7145(local8, this.anIntArray103, 0, false);
		} else {
			Class638.method32719(local8, new int[] { this.anInt931 * -1744842825 }, new int[] { 0 }, new int[] { this.anInt930 * -1245155003 });
		}
	}

	@OriginalMember(owner = "client!afx", name = "c", descriptor = "(I)V", line = 26)
	@Override
	public void method19911() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt929 * 2045545929].method25755();
		if (this.anInt930 * -1245155003 == 0) {
			Class96_Sub5.method7145(local8, this.anIntArray103, 0, false);
		} else {
			Class638.method32719(local8, new int[] { this.anInt931 * -1744842825 }, new int[] { 0 }, new int[] { this.anInt930 * -1245155003 });
		}
	}

	@OriginalMember(owner = "client!afx", name = "w", descriptor = "()V", line = 26)
	@Override
	public void method19913() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt929 * 2045545929].method25755();
		if (this.anInt930 * -1245155003 == 0) {
			Class96_Sub5.method7145(local8, this.anIntArray103, 0, false);
		} else {
			Class638.method32719(local8, new int[] { this.anInt931 * -1744842825 }, new int[] { 0 }, new int[] { this.anInt930 * -1245155003 });
		}
	}

	@OriginalMember(owner = "client!afx", name = "l", descriptor = "(I)Z", line = 32)
	@Override
	boolean method19903() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt931 * -1744842825);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afx", name = "t", descriptor = "()Z", line = 32)
	@Override
	boolean method19904() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt931 * -1744842825);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afx", name = "q", descriptor = "()Z", line = 32)
	@Override
	boolean method19905() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt931 * -1744842825);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afx", name = "ait", descriptor = "(Lclient!yf;I)V", line = 10828)
	static final void method7727(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class131_Sub1.method12543(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, false);
	}

	@OriginalMember(owner = "client!afx", name = "ase", descriptor = "(Lclient!yf;I)V", line = 12747)
	static final void method7728(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(53) boolean local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] == 1;
		Class638.method32717(local13, local28, local38, local53);
	}
}
