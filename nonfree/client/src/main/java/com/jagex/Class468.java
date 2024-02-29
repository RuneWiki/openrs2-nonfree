package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public class Class468 {

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	static final int anInt4987 = 7;

	@OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
	static int anInt4988;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "[I")
	int[] anIntArray465;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	int anInt4984;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	int anInt4985;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[I")
	int[] anIntArray466;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!ho;")
	Class305 aClass305_1;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	int anInt4986;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
	int[] anIntArray467;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "[I")
	int[] anIntArray468;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	int[] anIntArray469;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "[I")
	int[] anIntArray470;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "[I")
	int[] anIntArray471;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "[I")
	int[] anIntArray472;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "[[I")
	int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "[[I")
	int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[Lclient!ho;")
	Class305[] aClass305Array1;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "[I")
	int[] anIntArray473;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	int anInt4983;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "[B")
	byte[] aByteArray86;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "([BI[B)V", line = 29)
	Class468(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4983 = Class342.method27780(arg0, arg0.length) * -2136245927;
		if (arg1 != this.anInt4983 * -461160727) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray86 = Class659.method33068(arg0, 0, arg0.length);
			for (@Pc(41) int local41 = 0; local41 < 64; local41++) {
				if (this.aByteArray86[local41] != arg2[local41]) {
					throw new RuntimeException();
				}
			}
		}
		this.method29566(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "([B)V", line = 49)
	void method29565(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(Class471.method29624(arg0));
		@Pc(10) int local10 = local6.method22478();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4984 = local6.method22500() * -1069294537;
		} else {
			this.anInt4984 = 0;
		}
		@Pc(38) int local38 = local6.method22478();
		@Pc(46) boolean local46 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(73) boolean local73 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt4985 = local6.method22547() * -1433390337;
		} else {
			this.anInt4985 = local6.method22483() * -1433390337;
		}
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = -1;
		this.anIntArray470 = new int[this.anInt4985 * -1069101825];
		@Pc(107) int local107;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22547();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22483();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		}
		this.anInt4986 = (local95 + 1) * 1088977275;
		this.anIntArray467 = new int[this.anInt4986 * -540639821];
		if (local73) {
			this.anIntArray468 = new int[this.anInt4986 * -540639821];
		}
		if (local55) {
			this.aByteArrayArray15 = new byte[this.anInt4986 * -540639821][];
		}
		this.anIntArray473 = new int[this.anInt4986 * -540639821];
		this.anIntArray465 = new int[this.anInt4986 * -540639821];
		this.anIntArrayArray55 = new int[this.anInt4986 * -540639821][];
		this.anIntArray469 = new int[this.anInt4986 * -540639821];
		if (local46) {
			this.anIntArray466 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4986 * -540639821; local107++) {
				this.anIntArray466[local107] = -1;
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray466[this.anIntArray470[local107]] = local6.method22500();
			}
			this.aClass305_1 = new Class305(this.anIntArray466);
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray467[this.anIntArray470[local107]] = local6.method22500();
		}
		if (local73) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray468[local107] = local6.method22500();
			}
		}
		if (local55) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				@Pc(333) byte[] local333 = new byte[64];
				local6.method22533(local333, 0, 64);
				this.aByteArrayArray15[this.anIntArray470[local107]] = local333;
			}
		}
		if (local64) {
			this.anIntArray471 = new int[this.anInt4986 * -540639821];
			this.anIntArray472 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray471[this.anIntArray470[local107]] = local6.method22500();
				this.anIntArray472[this.anIntArray470[local107]] = local6.method22500();
			}
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray473[this.anIntArray470[local107]] = local6.method22500();
		}
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(486) int local486;
		@Pc(451) int local451;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22547();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22547();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22483();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22483();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		}
		if (!local46) {
			return;
		}
		this.anIntArrayArray56 = new int[local95 + 1][];
		this.aClass305Array1 = new Class305[local95 + 1];
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			local451 = this.anIntArray470[local107];
			local456 = this.anIntArray465[local451];
			this.anIntArrayArray56[local451] = new int[this.anIntArray469[local451]];
			for (local460 = 0; local460 < this.anIntArray469[local451]; local460++) {
				this.anIntArrayArray56[local451][local460] = -1;
			}
			for (local460 = 0; local460 < local456; local460++) {
				if (this.anIntArrayArray55[local451] == null) {
					local468 = local460;
				} else {
					local468 = this.anIntArrayArray55[local451][local460];
				}
				this.anIntArrayArray56[local451][local468] = local6.method22500();
			}
			this.aClass305Array1[local451] = new Class305(this.anIntArrayArray56[local451]);
		}
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "([BI)V", line = 49)
	void method29566(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(Class471.method29624(arg0));
		@Pc(10) int local10 = local6.method22478();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4984 = local6.method22500() * -1069294537;
		} else {
			this.anInt4984 = 0;
		}
		@Pc(38) int local38 = local6.method22478();
		@Pc(46) boolean local46 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(73) boolean local73 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt4985 = local6.method22547() * -1433390337;
		} else {
			this.anInt4985 = local6.method22483() * -1433390337;
		}
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = -1;
		this.anIntArray470 = new int[this.anInt4985 * -1069101825];
		@Pc(107) int local107;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22547();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22483();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		}
		this.anInt4986 = (local95 + 1) * 1088977275;
		this.anIntArray467 = new int[this.anInt4986 * -540639821];
		if (local73) {
			this.anIntArray468 = new int[this.anInt4986 * -540639821];
		}
		if (local55) {
			this.aByteArrayArray15 = new byte[this.anInt4986 * -540639821][];
		}
		this.anIntArray473 = new int[this.anInt4986 * -540639821];
		this.anIntArray465 = new int[this.anInt4986 * -540639821];
		this.anIntArrayArray55 = new int[this.anInt4986 * -540639821][];
		this.anIntArray469 = new int[this.anInt4986 * -540639821];
		if (local46) {
			this.anIntArray466 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4986 * -540639821; local107++) {
				this.anIntArray466[local107] = -1;
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray466[this.anIntArray470[local107]] = local6.method22500();
			}
			this.aClass305_1 = new Class305(this.anIntArray466);
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray467[this.anIntArray470[local107]] = local6.method22500();
		}
		if (local73) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray468[local107] = local6.method22500();
			}
		}
		if (local55) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				@Pc(333) byte[] local333 = new byte[64];
				local6.method22533(local333, 0, 64);
				this.aByteArrayArray15[this.anIntArray470[local107]] = local333;
			}
		}
		if (local64) {
			this.anIntArray471 = new int[this.anInt4986 * -540639821];
			this.anIntArray472 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray471[this.anIntArray470[local107]] = local6.method22500();
				this.anIntArray472[this.anIntArray470[local107]] = local6.method22500();
			}
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray473[this.anIntArray470[local107]] = local6.method22500();
		}
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(486) int local486;
		@Pc(451) int local451;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22547();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22547();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22483();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22483();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		}
		if (!local46) {
			return;
		}
		this.anIntArrayArray56 = new int[local95 + 1][];
		this.aClass305Array1 = new Class305[local95 + 1];
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			local451 = this.anIntArray470[local107];
			local456 = this.anIntArray465[local451];
			this.anIntArrayArray56[local451] = new int[this.anIntArray469[local451]];
			for (local460 = 0; local460 < this.anIntArray469[local451]; local460++) {
				this.anIntArrayArray56[local451][local460] = -1;
			}
			for (local460 = 0; local460 < local456; local460++) {
				if (this.anIntArrayArray55[local451] == null) {
					local468 = local460;
				} else {
					local468 = this.anIntArrayArray55[local451][local460];
				}
				this.anIntArrayArray56[local451][local468] = local6.method22500();
			}
			this.aClass305Array1[local451] = new Class305(this.anIntArrayArray56[local451]);
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "([B)V", line = 49)
	void method29567(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(Class471.method29624(arg0));
		@Pc(10) int local10 = local6.method22478();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4984 = local6.method22500() * -1069294537;
		} else {
			this.anInt4984 = 0;
		}
		@Pc(38) int local38 = local6.method22478();
		@Pc(46) boolean local46 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(73) boolean local73 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt4985 = local6.method22547() * -1433390337;
		} else {
			this.anInt4985 = local6.method22483() * -1433390337;
		}
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = -1;
		this.anIntArray470 = new int[this.anInt4985 * -1069101825];
		@Pc(107) int local107;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22547();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22483();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		}
		this.anInt4986 = (local95 + 1) * 1088977275;
		this.anIntArray467 = new int[this.anInt4986 * -540639821];
		if (local73) {
			this.anIntArray468 = new int[this.anInt4986 * -540639821];
		}
		if (local55) {
			this.aByteArrayArray15 = new byte[this.anInt4986 * -540639821][];
		}
		this.anIntArray473 = new int[this.anInt4986 * -540639821];
		this.anIntArray465 = new int[this.anInt4986 * -540639821];
		this.anIntArrayArray55 = new int[this.anInt4986 * -540639821][];
		this.anIntArray469 = new int[this.anInt4986 * -540639821];
		if (local46) {
			this.anIntArray466 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4986 * -540639821; local107++) {
				this.anIntArray466[local107] = -1;
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray466[this.anIntArray470[local107]] = local6.method22500();
			}
			this.aClass305_1 = new Class305(this.anIntArray466);
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray467[this.anIntArray470[local107]] = local6.method22500();
		}
		if (local73) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray468[local107] = local6.method22500();
			}
		}
		if (local55) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				@Pc(333) byte[] local333 = new byte[64];
				local6.method22533(local333, 0, 64);
				this.aByteArrayArray15[this.anIntArray470[local107]] = local333;
			}
		}
		if (local64) {
			this.anIntArray471 = new int[this.anInt4986 * -540639821];
			this.anIntArray472 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray471[this.anIntArray470[local107]] = local6.method22500();
				this.anIntArray472[this.anIntArray470[local107]] = local6.method22500();
			}
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray473[this.anIntArray470[local107]] = local6.method22500();
		}
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(486) int local486;
		@Pc(451) int local451;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22547();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22547();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22483();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22483();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		}
		if (!local46) {
			return;
		}
		this.anIntArrayArray56 = new int[local95 + 1][];
		this.aClass305Array1 = new Class305[local95 + 1];
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			local451 = this.anIntArray470[local107];
			local456 = this.anIntArray465[local451];
			this.anIntArrayArray56[local451] = new int[this.anIntArray469[local451]];
			for (local460 = 0; local460 < this.anIntArray469[local451]; local460++) {
				this.anIntArrayArray56[local451][local460] = -1;
			}
			for (local460 = 0; local460 < local456; local460++) {
				if (this.anIntArrayArray55[local451] == null) {
					local468 = local460;
				} else {
					local468 = this.anIntArrayArray55[local451][local460];
				}
				this.anIntArrayArray56[local451][local468] = local6.method22500();
			}
			this.aClass305Array1[local451] = new Class305(this.anIntArrayArray56[local451]);
		}
	}

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "([B)V", line = 49)
	void method29568(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(Class471.method29624(arg0));
		@Pc(10) int local10 = local6.method22478();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4984 = local6.method22500() * -1069294537;
		} else {
			this.anInt4984 = 0;
		}
		@Pc(38) int local38 = local6.method22478();
		@Pc(46) boolean local46 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(73) boolean local73 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt4985 = local6.method22547() * -1433390337;
		} else {
			this.anInt4985 = local6.method22483() * -1433390337;
		}
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = -1;
		this.anIntArray470 = new int[this.anInt4985 * -1069101825];
		@Pc(107) int local107;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22547();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray470[local107] = local93 += local6.method22483();
				if (this.anIntArray470[local107] > local95) {
					local95 = this.anIntArray470[local107];
				}
			}
		}
		this.anInt4986 = (local95 + 1) * 1088977275;
		this.anIntArray467 = new int[this.anInt4986 * -540639821];
		if (local73) {
			this.anIntArray468 = new int[this.anInt4986 * -540639821];
		}
		if (local55) {
			this.aByteArrayArray15 = new byte[this.anInt4986 * -540639821][];
		}
		this.anIntArray473 = new int[this.anInt4986 * -540639821];
		this.anIntArray465 = new int[this.anInt4986 * -540639821];
		this.anIntArrayArray55 = new int[this.anInt4986 * -540639821][];
		this.anIntArray469 = new int[this.anInt4986 * -540639821];
		if (local46) {
			this.anIntArray466 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4986 * -540639821; local107++) {
				this.anIntArray466[local107] = -1;
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray466[this.anIntArray470[local107]] = local6.method22500();
			}
			this.aClass305_1 = new Class305(this.anIntArray466);
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray467[this.anIntArray470[local107]] = local6.method22500();
		}
		if (local73) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray468[local107] = local6.method22500();
			}
		}
		if (local55) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				@Pc(333) byte[] local333 = new byte[64];
				local6.method22533(local333, 0, 64);
				this.aByteArrayArray15[this.anIntArray470[local107]] = local333;
			}
		}
		if (local64) {
			this.anIntArray471 = new int[this.anInt4986 * -540639821];
			this.anIntArray472 = new int[this.anInt4986 * -540639821];
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray471[this.anIntArray470[local107]] = local6.method22500();
				this.anIntArray472[this.anIntArray470[local107]] = local6.method22500();
			}
		}
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			this.anIntArray473[this.anIntArray470[local107]] = local6.method22500();
		}
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(486) int local486;
		@Pc(451) int local451;
		if (local10 >= 7) {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22547();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22547();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		} else {
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				this.anIntArray465[this.anIntArray470[local107]] = local6.method22483();
			}
			for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
				local451 = this.anIntArray470[local107];
				local456 = this.anIntArray465[local451];
				local93 = 0;
				local460 = -1;
				this.anIntArrayArray55[local451] = new int[local456];
				for (local468 = 0; local468 < local456; local468++) {
					local486 = this.anIntArrayArray55[local451][local468] = local93 += local6.method22483();
					if (local486 > local460) {
						local460 = local486;
					}
				}
				this.anIntArray469[local451] = local460 + 1;
				if (local456 == local460 + 1) {
					this.anIntArrayArray55[local451] = null;
				}
			}
		}
		if (!local46) {
			return;
		}
		this.anIntArrayArray56 = new int[local95 + 1][];
		this.aClass305Array1 = new Class305[local95 + 1];
		for (local107 = 0; local107 < this.anInt4985 * -1069101825; local107++) {
			local451 = this.anIntArray470[local107];
			local456 = this.anIntArray465[local451];
			this.anIntArrayArray56[local451] = new int[this.anIntArray469[local451]];
			for (local460 = 0; local460 < this.anIntArray469[local451]; local460++) {
				this.anIntArrayArray56[local451][local460] = -1;
			}
			for (local460 = 0; local460 < local456; local460++) {
				if (this.anIntArrayArray55[local451] == null) {
					local468 = local460;
				} else {
					local468 = this.anIntArrayArray55[local451][local460];
				}
				this.anIntArrayArray56[local451][local468] = local6.method22500();
			}
			this.aClass305Array1[local451] = new Class305(this.anIntArrayArray56[local451]);
		}
	}

	@OriginalMember(owner = "client!pm", name = "ju", descriptor = "(Lclient!yf;I)V", line = 6255)
	static final void method29569(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		client.method25214(local11, local14, arg0);
	}
}
