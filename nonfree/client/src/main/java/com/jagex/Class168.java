package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public class Class168 {

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	int anInt3454;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
	int[] anIntArray351;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	int anInt3455;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
	int[] anIntArray353;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!fu;")
	Class184 aClass184_1;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
	int[] anIntArray354;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
	int[] anIntArray355;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	int[] anIntArray352 = null;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 15)
	Class168() {
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "([I)V", line = 18)
	void method23344(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!fu;)V", line = 25)
	void method23345(@OriginalArg(0) Class184 arg0) {
		this.aClass184_1 = arg0;
		@Pc(6) int local6 = this.aClass184_1.method23801();
		this.aClass184_1.method23812(16);
		this.anInt3454 = this.aClass184_1.method23817() == 0 ? 1 : this.aClass184_1.method23812(4) + 1;
		@Pc(77) int local77;
		if (this.aClass184_1.method23817() == 0) {
			this.anInt3455 = 0;
		} else {
			this.anInt3455 = this.aClass184_1.method23812(8) + 1;
			if (this.anIntArray354 != null && this.anIntArray354.length == this.anInt3455) {
				this.method23344(this.anIntArray354);
			} else {
				this.anIntArray354 = new int[this.anInt3455];
			}
			if (this.anIntArray355 != null && this.anIntArray355.length == this.anInt3455) {
				this.method23344(this.anIntArray355);
			} else {
				this.anIntArray355 = new int[this.anInt3455];
			}
			for (local77 = 0; local77 < this.anInt3455; local77++) {
				this.anIntArray354[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
				this.anIntArray355[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
			}
		}
		this.aClass184_1.method23812(2);
		if (this.anInt3454 > 1) {
			this.anIntArray352 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray352[local77] = this.aClass184_1.method23812(4);
			}
		}
		if (this.anIntArray353 != null && this.anIntArray353.length == this.anInt3454) {
			this.method23344(this.anIntArray353);
		} else {
			this.anIntArray353 = new int[this.anInt3454];
		}
		if (this.anIntArray351 != null && this.anIntArray351.length == this.anInt3454) {
			this.method23344(this.anIntArray351);
		} else {
			this.anIntArray351 = new int[this.anInt3454];
		}
		for (local77 = 0; local77 < this.anInt3454; local77++) {
			this.aClass184_1.method23812(8);
			this.anIntArray353[local77] = this.aClass184_1.method23812(8);
			this.anIntArray351[local77] = this.aClass184_1.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(Lclient!fu;)V", line = 25)
	void method23347(@OriginalArg(0) Class184 arg0) {
		this.aClass184_1 = arg0;
		@Pc(6) int local6 = this.aClass184_1.method23801();
		this.aClass184_1.method23812(16);
		this.anInt3454 = this.aClass184_1.method23817() == 0 ? 1 : this.aClass184_1.method23812(4) + 1;
		@Pc(77) int local77;
		if (this.aClass184_1.method23817() == 0) {
			this.anInt3455 = 0;
		} else {
			this.anInt3455 = this.aClass184_1.method23812(8) + 1;
			if (this.anIntArray354 != null && this.anIntArray354.length == this.anInt3455) {
				this.method23344(this.anIntArray354);
			} else {
				this.anIntArray354 = new int[this.anInt3455];
			}
			if (this.anIntArray355 != null && this.anIntArray355.length == this.anInt3455) {
				this.method23344(this.anIntArray355);
			} else {
				this.anIntArray355 = new int[this.anInt3455];
			}
			for (local77 = 0; local77 < this.anInt3455; local77++) {
				this.anIntArray354[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
				this.anIntArray355[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
			}
		}
		this.aClass184_1.method23812(2);
		if (this.anInt3454 > 1) {
			this.anIntArray352 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray352[local77] = this.aClass184_1.method23812(4);
			}
		}
		if (this.anIntArray353 != null && this.anIntArray353.length == this.anInt3454) {
			this.method23344(this.anIntArray353);
		} else {
			this.anIntArray353 = new int[this.anInt3454];
		}
		if (this.anIntArray351 != null && this.anIntArray351.length == this.anInt3454) {
			this.method23344(this.anIntArray351);
		} else {
			this.anIntArray351 = new int[this.anInt3454];
		}
		for (local77 = 0; local77 < this.anInt3454; local77++) {
			this.aClass184_1.method23812(8);
			this.anIntArray353[local77] = this.aClass184_1.method23812(8);
			this.anIntArray351[local77] = this.aClass184_1.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "(Lclient!fu;)V", line = 25)
	void method23348(@OriginalArg(0) Class184 arg0) {
		this.aClass184_1 = arg0;
		@Pc(6) int local6 = this.aClass184_1.method23801();
		this.aClass184_1.method23812(16);
		this.anInt3454 = this.aClass184_1.method23817() == 0 ? 1 : this.aClass184_1.method23812(4) + 1;
		@Pc(77) int local77;
		if (this.aClass184_1.method23817() == 0) {
			this.anInt3455 = 0;
		} else {
			this.anInt3455 = this.aClass184_1.method23812(8) + 1;
			if (this.anIntArray354 != null && this.anIntArray354.length == this.anInt3455) {
				this.method23344(this.anIntArray354);
			} else {
				this.anIntArray354 = new int[this.anInt3455];
			}
			if (this.anIntArray355 != null && this.anIntArray355.length == this.anInt3455) {
				this.method23344(this.anIntArray355);
			} else {
				this.anIntArray355 = new int[this.anInt3455];
			}
			for (local77 = 0; local77 < this.anInt3455; local77++) {
				this.anIntArray354[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
				this.anIntArray355[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
			}
		}
		this.aClass184_1.method23812(2);
		if (this.anInt3454 > 1) {
			this.anIntArray352 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray352[local77] = this.aClass184_1.method23812(4);
			}
		}
		if (this.anIntArray353 != null && this.anIntArray353.length == this.anInt3454) {
			this.method23344(this.anIntArray353);
		} else {
			this.anIntArray353 = new int[this.anInt3454];
		}
		if (this.anIntArray351 != null && this.anIntArray351.length == this.anInt3454) {
			this.method23344(this.anIntArray351);
		} else {
			this.anIntArray351 = new int[this.anInt3454];
		}
		for (local77 = 0; local77 < this.anInt3454; local77++) {
			this.aClass184_1.method23812(8);
			this.anIntArray353[local77] = this.aClass184_1.method23812(8);
			this.anIntArray351[local77] = this.aClass184_1.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(Lclient!fu;)V", line = 25)
	void method23349(@OriginalArg(0) Class184 arg0) {
		this.aClass184_1 = arg0;
		@Pc(6) int local6 = this.aClass184_1.method23801();
		this.aClass184_1.method23812(16);
		this.anInt3454 = this.aClass184_1.method23817() == 0 ? 1 : this.aClass184_1.method23812(4) + 1;
		@Pc(77) int local77;
		if (this.aClass184_1.method23817() == 0) {
			this.anInt3455 = 0;
		} else {
			this.anInt3455 = this.aClass184_1.method23812(8) + 1;
			if (this.anIntArray354 != null && this.anIntArray354.length == this.anInt3455) {
				this.method23344(this.anIntArray354);
			} else {
				this.anIntArray354 = new int[this.anInt3455];
			}
			if (this.anIntArray355 != null && this.anIntArray355.length == this.anInt3455) {
				this.method23344(this.anIntArray355);
			} else {
				this.anIntArray355 = new int[this.anInt3455];
			}
			for (local77 = 0; local77 < this.anInt3455; local77++) {
				this.anIntArray354[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
				this.anIntArray355[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
			}
		}
		this.aClass184_1.method23812(2);
		if (this.anInt3454 > 1) {
			this.anIntArray352 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray352[local77] = this.aClass184_1.method23812(4);
			}
		}
		if (this.anIntArray353 != null && this.anIntArray353.length == this.anInt3454) {
			this.method23344(this.anIntArray353);
		} else {
			this.anIntArray353 = new int[this.anInt3454];
		}
		if (this.anIntArray351 != null && this.anIntArray351.length == this.anInt3454) {
			this.method23344(this.anIntArray351);
		} else {
			this.anIntArray351 = new int[this.anInt3454];
		}
		for (local77 = 0; local77 < this.anInt3454; local77++) {
			this.aClass184_1.method23812(8);
			this.anIntArray353[local77] = this.aClass184_1.method23812(8);
			this.anIntArray351[local77] = this.aClass184_1.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "(Lclient!fu;)V", line = 25)
	void method23350(@OriginalArg(0) Class184 arg0) {
		this.aClass184_1 = arg0;
		@Pc(6) int local6 = this.aClass184_1.method23801();
		this.aClass184_1.method23812(16);
		this.anInt3454 = this.aClass184_1.method23817() == 0 ? 1 : this.aClass184_1.method23812(4) + 1;
		@Pc(77) int local77;
		if (this.aClass184_1.method23817() == 0) {
			this.anInt3455 = 0;
		} else {
			this.anInt3455 = this.aClass184_1.method23812(8) + 1;
			if (this.anIntArray354 != null && this.anIntArray354.length == this.anInt3455) {
				this.method23344(this.anIntArray354);
			} else {
				this.anIntArray354 = new int[this.anInt3455];
			}
			if (this.anIntArray355 != null && this.anIntArray355.length == this.anInt3455) {
				this.method23344(this.anIntArray355);
			} else {
				this.anIntArray355 = new int[this.anInt3455];
			}
			for (local77 = 0; local77 < this.anInt3455; local77++) {
				this.anIntArray354[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
				this.anIntArray355[local77] = this.aClass184_1.method23812(this.method23346(local6 - 1));
			}
		}
		this.aClass184_1.method23812(2);
		if (this.anInt3454 > 1) {
			this.anIntArray352 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray352[local77] = this.aClass184_1.method23812(4);
			}
		}
		if (this.anIntArray353 != null && this.anIntArray353.length == this.anInt3454) {
			this.method23344(this.anIntArray353);
		} else {
			this.anIntArray353 = new int[this.anInt3454];
		}
		if (this.anIntArray351 != null && this.anIntArray351.length == this.anInt3454) {
			this.method23344(this.anIntArray351);
		} else {
			this.anIntArray351 = new int[this.anInt3454];
		}
		for (local77 = 0; local77 < this.anInt3454; local77++) {
			this.aClass184_1.method23812(8);
			this.anIntArray353[local77] = this.aClass184_1.method23812(8);
			this.anIntArray351[local77] = this.aClass184_1.method23812(8);
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)I", line = 78)
	int method23346(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(I)I", line = 78)
	int method23351(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}
}
