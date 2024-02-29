package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public class Class278 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	int anInt3955;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "[I")
	int[] anIntArray405;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "[I")
	int[] anIntArray407;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "Lclient!gx;")
	Class288 aClass288_3;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	int anInt3956;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	int[] anIntArray408;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
	int[] anIntArray409;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "[I")
	int[] anIntArray406 = null;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 15)
	Class278() {
	}

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "([I)V", line = 18)
	void method26659(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "([I)V", line = 18)
	void method26660(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "([I)V", line = 18)
	void method26661(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(Lclient!gx;)V", line = 25)
	void method26662(@OriginalArg(0) Class288 arg0) {
		this.aClass288_3 = arg0;
		@Pc(6) int local6 = this.aClass288_3.method26866();
		this.aClass288_3.method26923(16);
		this.anInt3956 = this.aClass288_3.method26919() == 0 ? 1 : this.aClass288_3.method26923(4) + 1;
		@Pc(77) int local77;
		if (this.aClass288_3.method26919() == 0) {
			this.anInt3955 = 0;
		} else {
			this.anInt3955 = this.aClass288_3.method26923(8) + 1;
			if (this.anIntArray408 != null && this.anIntArray408.length == this.anInt3955) {
				this.method26660(this.anIntArray408);
			} else {
				this.anIntArray408 = new int[this.anInt3955];
			}
			if (this.anIntArray409 != null && this.anIntArray409.length == this.anInt3955) {
				this.method26660(this.anIntArray409);
			} else {
				this.anIntArray409 = new int[this.anInt3955];
			}
			for (local77 = 0; local77 < this.anInt3955; local77++) {
				this.anIntArray408[local77] = this.aClass288_3.method26923(this.method26664(local6 - 1));
				this.anIntArray409[local77] = this.aClass288_3.method26923(this.method26664(local6 - 1));
			}
		}
		this.aClass288_3.method26923(2);
		if (this.anInt3956 > 1) {
			this.anIntArray406 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray406[local77] = this.aClass288_3.method26923(4);
			}
		}
		if (this.anIntArray407 != null && this.anIntArray407.length == this.anInt3956) {
			this.method26660(this.anIntArray407);
		} else {
			this.anIntArray407 = new int[this.anInt3956];
		}
		if (this.anIntArray405 != null && this.anIntArray405.length == this.anInt3956) {
			this.method26660(this.anIntArray405);
		} else {
			this.anIntArray405 = new int[this.anInt3956];
		}
		for (local77 = 0; local77 < this.anInt3956; local77++) {
			this.aClass288_3.method26923(8);
			this.anIntArray407[local77] = this.aClass288_3.method26923(8);
			this.anIntArray405[local77] = this.aClass288_3.method26923(8);
		}
	}

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "(Lclient!gx;)V", line = 25)
	void method26663(@OriginalArg(0) Class288 arg0) {
		this.aClass288_3 = arg0;
		@Pc(6) int local6 = this.aClass288_3.method26866();
		this.aClass288_3.method26923(16);
		this.anInt3956 = this.aClass288_3.method26919() == 0 ? 1 : this.aClass288_3.method26923(4) + 1;
		@Pc(77) int local77;
		if (this.aClass288_3.method26919() == 0) {
			this.anInt3955 = 0;
		} else {
			this.anInt3955 = this.aClass288_3.method26923(8) + 1;
			if (this.anIntArray408 != null && this.anIntArray408.length == this.anInt3955) {
				this.method26660(this.anIntArray408);
			} else {
				this.anIntArray408 = new int[this.anInt3955];
			}
			if (this.anIntArray409 != null && this.anIntArray409.length == this.anInt3955) {
				this.method26660(this.anIntArray409);
			} else {
				this.anIntArray409 = new int[this.anInt3955];
			}
			for (local77 = 0; local77 < this.anInt3955; local77++) {
				this.anIntArray408[local77] = this.aClass288_3.method26923(this.method26664(local6 - 1));
				this.anIntArray409[local77] = this.aClass288_3.method26923(this.method26664(local6 - 1));
			}
		}
		this.aClass288_3.method26923(2);
		if (this.anInt3956 > 1) {
			this.anIntArray406 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray406[local77] = this.aClass288_3.method26923(4);
			}
		}
		if (this.anIntArray407 != null && this.anIntArray407.length == this.anInt3956) {
			this.method26660(this.anIntArray407);
		} else {
			this.anIntArray407 = new int[this.anInt3956];
		}
		if (this.anIntArray405 != null && this.anIntArray405.length == this.anInt3956) {
			this.method26660(this.anIntArray405);
		} else {
			this.anIntArray405 = new int[this.anInt3956];
		}
		for (local77 = 0; local77 < this.anInt3956; local77++) {
			this.aClass288_3.method26923(8);
			this.anIntArray407[local77] = this.aClass288_3.method26923(8);
			this.anIntArray405[local77] = this.aClass288_3.method26923(8);
		}
	}

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "(I)I", line = 78)
	int method26664(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "(I)I", line = 78)
	int method26665(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}
}
