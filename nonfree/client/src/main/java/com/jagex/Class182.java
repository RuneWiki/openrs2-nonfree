package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!by")
public class Class182 {

	@OriginalMember(owner = "client!by", name = "c", descriptor = "I")
	static final int anInt3320 = 128;

	@OriginalMember(owner = "client!by", name = "p", descriptor = "I")
	static final int anInt3321 = 7;

	@OriginalMember(owner = "client!by", name = "t", descriptor = "Z")
	boolean aBoolean565 = true;

	@OriginalMember(owner = "client!by", name = "q", descriptor = "I")
	int anInt3319 = -1;

	@OriginalMember(owner = "client!by", name = "v", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_42;

	@OriginalMember(owner = "client!by", name = "l", descriptor = "Lclient!cc;")
	final Class185 aClass185_2;

	@OriginalMember(owner = "client!by", name = "y", descriptor = "I")
	final int anInt3318;

	@OriginalMember(owner = "client!by", name = "w", descriptor = "I")
	final int anInt3317;

	@OriginalMember(owner = "client!by", name = "x", descriptor = "I")
	final int anInt3322;

	@OriginalMember(owner = "client!by", name = "d", descriptor = "Lclient!ca;")
	Interface15 anInterface15_5;

	@OriginalMember(owner = "client!by", name = "s", descriptor = "Lclient!adh;")
	Class74_Sub2 aClass74_Sub2_2;

	@OriginalMember(owner = "client!by", name = "r", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_5;

	@OriginalMember(owner = "client!by", name = "<init>", descriptor = "(Lclient!aeq;Lclient!cc;Lclient!aeg;IIIII)V", line = 21)
	Class182(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class88_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub3_42 = arg0;
		this.aClass185_2 = arg1;
		this.anInt3318 = arg6;
		this.anInt3317 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt607 * -1924295585 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray1[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		this.anInt3322 = local25;
		if (local25 > 0) {
			@Pc(83) Class77_Sub39 local83 = new Class77_Sub39(local25 * 2);
			@Pc(114) short[] local114;
			@Pc(118) int local118;
			@Pc(105) int local105;
			if (this.aClass86_Sub3_42.aBoolean116) {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt607 * -1924295585 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray1[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method22408(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt607 * -1924295585 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray1[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method22412(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface15_5 = this.aClass86_Sub3_42.method6138(5123, local83.aByteArray53, local83.anInt3089 * 31645619, false);
			this.aClass74_Sub2_2 = new Class74_Sub2(this.aClass86_Sub3_42, 5123, null, 1);
		} else {
			this.aClass78_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!by", name = "p", descriptor = "()V", line = 69)
	void method24572() {
		this.method24578(this.anInterface15_5, this.anInt3322);
	}

	@OriginalMember(owner = "client!by", name = "w", descriptor = "()V", line = 69)
	void method24573() {
		this.method24578(this.anInterface15_5, this.anInt3322);
	}

	@OriginalMember(owner = "client!by", name = "y", descriptor = "()V", line = 69)
	void method24574() {
		this.method24578(this.anInterface15_5, this.anInt3322);
	}

	@OriginalMember(owner = "client!by", name = "q", descriptor = "([BI)V", line = 73)
	void method24575(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass74_Sub2_2.method1832(arg0, arg1 * 2);
		this.method24578(this.aClass74_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!by", name = "c", descriptor = "([BI)V", line = 73)
	void method24576(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass74_Sub2_2.method1832(arg0, arg1 * 2);
		this.method24578(this.aClass74_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!by", name = "t", descriptor = "([BI)V", line = 73)
	void method24577(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass74_Sub2_2.method1832(arg0, arg1 * 2);
		this.method24578(this.aClass74_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!by", name = "v", descriptor = "(Lclient!ca;I)V", line = 78)
	void method24578(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24580();
			this.aClass86_Sub3_42.method6195(this.aClass78_Sub2_5);
			this.aClass86_Sub3_42.method6163(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!by", name = "x", descriptor = "(Lclient!ca;I)V", line = 78)
	void method24579(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24580();
			this.aClass86_Sub3_42.method6195(this.aClass78_Sub2_5);
			this.aClass86_Sub3_42.method6163(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!by", name = "l", descriptor = "()V", line = 85)
	void method24580() {
		if (!this.aBoolean565) {
			return;
		}
		this.aBoolean565 = false;
		@Pc(10) byte[] local10 = this.aClass185_2.aByteArray58;
		@Pc(14) byte[] local14 = this.aClass86_Sub3_42.aByteArray14;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass185_2.anInt3328;
		@Pc(30) int local30 = this.anInt3318 + this.anInt3317 * this.aClass185_2.anInt3328;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass78_Sub2_5 != null && this.anInt3319 == local16) {
			this.aBoolean565 = false;
			return;
		}
		this.anInt3319 = local16;
		local32 = 0;
		local30 = this.anInt3318 + this.anInt3317 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass185_2.anInt3328 - 128;
		}
		if (this.aClass78_Sub2_5 == null) {
			this.aClass78_Sub2_5 = new Class78_Sub2(this.aClass86_Sub3_42, 3553, Class212.aClass212_17, Class206.aClass206_23, 128, 128, false, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, false);
			this.aClass78_Sub2_5.method17493(false, false);
			this.aClass78_Sub2_5.method17453(true);
		} else {
			this.aClass78_Sub2_5.method17495(0, 0, 128, 128, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!by", name = "r", descriptor = "()V", line = 85)
	void method24581() {
		if (!this.aBoolean565) {
			return;
		}
		this.aBoolean565 = false;
		@Pc(10) byte[] local10 = this.aClass185_2.aByteArray58;
		@Pc(14) byte[] local14 = this.aClass86_Sub3_42.aByteArray14;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass185_2.anInt3328;
		@Pc(30) int local30 = this.anInt3318 + this.anInt3317 * this.aClass185_2.anInt3328;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass78_Sub2_5 != null && this.anInt3319 == local16) {
			this.aBoolean565 = false;
			return;
		}
		this.anInt3319 = local16;
		local32 = 0;
		local30 = this.anInt3318 + this.anInt3317 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass185_2.anInt3328 - 128;
		}
		if (this.aClass78_Sub2_5 == null) {
			this.aClass78_Sub2_5 = new Class78_Sub2(this.aClass86_Sub3_42, 3553, Class212.aClass212_17, Class206.aClass206_23, 128, 128, false, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, false);
			this.aClass78_Sub2_5.method17493(false, false);
			this.aClass78_Sub2_5.method17453(true);
		} else {
			this.aClass78_Sub2_5.method17495(0, 0, 128, 128, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!by", name = "d", descriptor = "()V", line = 85)
	void method24582() {
		if (!this.aBoolean565) {
			return;
		}
		this.aBoolean565 = false;
		@Pc(10) byte[] local10 = this.aClass185_2.aByteArray58;
		@Pc(14) byte[] local14 = this.aClass86_Sub3_42.aByteArray14;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass185_2.anInt3328;
		@Pc(30) int local30 = this.anInt3318 + this.anInt3317 * this.aClass185_2.anInt3328;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass78_Sub2_5 != null && this.anInt3319 == local16) {
			this.aBoolean565 = false;
			return;
		}
		this.anInt3319 = local16;
		local32 = 0;
		local30 = this.anInt3318 + this.anInt3317 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass185_2.anInt3328 - 128;
		}
		if (this.aClass78_Sub2_5 == null) {
			this.aClass78_Sub2_5 = new Class78_Sub2(this.aClass86_Sub3_42, 3553, Class212.aClass212_17, Class206.aClass206_23, 128, 128, false, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, false);
			this.aClass78_Sub2_5.method17493(false, false);
			this.aClass78_Sub2_5.method17453(true);
		} else {
			this.aClass78_Sub2_5.method17495(0, 0, 128, 128, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!by", name = "s", descriptor = "()V", line = 85)
	void method24583() {
		if (!this.aBoolean565) {
			return;
		}
		this.aBoolean565 = false;
		@Pc(10) byte[] local10 = this.aClass185_2.aByteArray58;
		@Pc(14) byte[] local14 = this.aClass86_Sub3_42.aByteArray14;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass185_2.anInt3328;
		@Pc(30) int local30 = this.anInt3318 + this.anInt3317 * this.aClass185_2.anInt3328;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass78_Sub2_5 != null && this.anInt3319 == local16) {
			this.aBoolean565 = false;
			return;
		}
		this.anInt3319 = local16;
		local32 = 0;
		local30 = this.anInt3318 + this.anInt3317 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass185_2.anInt3328 - 128;
		}
		if (this.aClass78_Sub2_5 == null) {
			this.aClass78_Sub2_5 = new Class78_Sub2(this.aClass86_Sub3_42, 3553, Class212.aClass212_17, Class206.aClass206_23, 128, 128, false, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, false);
			this.aClass78_Sub2_5.method17493(false, false);
			this.aClass78_Sub2_5.method17453(true);
		} else {
			this.aClass78_Sub2_5.method17495(0, 0, 128, 128, this.aClass86_Sub3_42.aByteArray14, Class212.aClass212_17, 0, 0, false);
		}
	}
}
