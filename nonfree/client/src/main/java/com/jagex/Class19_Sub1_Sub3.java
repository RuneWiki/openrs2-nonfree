package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aky")
public class Class19_Sub1_Sub3 extends Class19_Sub1 {

	@OriginalMember(owner = "client!aky", name = "a", descriptor = "I")
	static final int anInt2537 = 16;

	@OriginalMember(owner = "client!aky", name = "x", descriptor = "I")
	int anInt2538;

	@OriginalMember(owner = "client!aky", name = "y", descriptor = "Lclient!bj;")
	Interface4 anInterface4_1;

	@OriginalMember(owner = "client!aky", name = "h", descriptor = "I")
	int anInt2539;

	@OriginalMember(owner = "client!aky", name = "s", descriptor = "I")
	int anInt2540;

	@OriginalMember(owner = "client!aky", name = "u", descriptor = "I")
	int anInt2541;

	@OriginalMember(owner = "client!aky", name = "b", descriptor = "[Lclient!bj;")
	final Interface4[] anInterface4Array1 = new Interface4[4];

	@OriginalMember(owner = "client!aky", name = "g", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_33;

	@OriginalMember(owner = "client!aky", name = "l", descriptor = "I")
	int anInt2542;

	@OriginalMember(owner = "client!aky", name = "<init>", descriptor = "(Lclient!abt;)V", line = 18)
	Class19_Sub1_Sub3(@OriginalArg(0) Class21_Sub2 arg0) {
		if (!arg0.aBoolean77) {
			throw new IllegalStateException("");
		}
		this.aClass21_Sub2_33 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, local19, 0);
		this.anInt2542 = local19[0];
	}

	@OriginalMember(owner = "client!aky", name = "p", descriptor = "()I", line = 27)
	@Override
	public int method21390() {
		return this.anInt2539;
	}

	@OriginalMember(owner = "client!aky", name = "d", descriptor = "()I", line = 27)
	@Override
	public int method21405() {
		return this.anInt2539;
	}

	@OriginalMember(owner = "client!aky", name = "q", descriptor = "()I", line = 27)
	@Override
	public int method21389() {
		return this.anInt2539;
	}

	@OriginalMember(owner = "client!aky", name = "a", descriptor = "()I", line = 31)
	@Override
	public int method21391() {
		return this.anInt2538;
	}

	@OriginalMember(owner = "client!aky", name = "s", descriptor = "()I", line = 31)
	@Override
	public int method21404() {
		return this.anInt2538;
	}

	@OriginalMember(owner = "client!aky", name = "x", descriptor = "()I", line = 31)
	@Override
	public int method21394() {
		return this.anInt2538;
	}

	@OriginalMember(owner = "client!aky", name = "v", descriptor = "(ILclient!da;)V", line = 35)
	@Override
	public void method20882(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface4 local6 = (Interface4) arg1;
		if (arg1 == null) {
			this.anInt2540 &= ~local3;
			this.anInterface4Array1[arg0] = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | local3) == local3) {
				this.anInt2538 = local6.method27212();
				this.anInt2539 = local6.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local6.method27217() || this.anInt2538 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= local3;
			this.anInterface4Array1[arg0] = local6;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17956(arg0);
		} else {
			this.anInt2541 |= local3;
		}
	}

	@OriginalMember(owner = "client!aky", name = "o", descriptor = "(ILclient!da;)V", line = 35)
	@Override
	public void method20887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface4 local6 = (Interface4) arg1;
		if (arg1 == null) {
			this.anInt2540 &= ~local3;
			this.anInterface4Array1[arg0] = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | local3) == local3) {
				this.anInt2538 = local6.method27212();
				this.anInt2539 = local6.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local6.method27217() || this.anInt2538 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= local3;
			this.anInterface4Array1[arg0] = local6;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17956(arg0);
		} else {
			this.anInt2541 |= local3;
		}
	}

	@OriginalMember(owner = "client!aky", name = "f", descriptor = "(ILclient!da;)V", line = 35)
	@Override
	public void method20886(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface4 local6 = (Interface4) arg1;
		if (arg1 == null) {
			this.anInt2540 &= ~local3;
			this.anInterface4Array1[arg0] = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | local3) == local3) {
				this.anInt2538 = local6.method27212();
				this.anInt2539 = local6.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local6.method27217() || this.anInt2538 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= local3;
			this.anInterface4Array1[arg0] = local6;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17956(arg0);
		} else {
			this.anInt2541 |= local3;
		}
	}

	@OriginalMember(owner = "client!aky", name = "k", descriptor = "(ILclient!da;)V", line = 35)
	@Override
	public void method20881(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface4 local6 = (Interface4) arg1;
		if (arg1 == null) {
			this.anInt2540 &= ~local3;
			this.anInterface4Array1[arg0] = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | local3) == local3) {
				this.anInt2538 = local6.method27212();
				this.anInt2539 = local6.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local6.method27217() || this.anInt2538 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= local3;
			this.anInterface4Array1[arg0] = local6;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17956(arg0);
		} else {
			this.anInt2541 |= local3;
		}
	}

	@OriginalMember(owner = "client!aky", name = "i", descriptor = "(ILclient!da;)V", line = 35)
	@Override
	public void method20891(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface4 local6 = (Interface4) arg1;
		if (arg1 == null) {
			this.anInt2540 &= ~local3;
			this.anInterface4Array1[arg0] = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | local3) == local3) {
				this.anInt2538 = local6.method27212();
				this.anInt2539 = local6.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local6.method27217() || this.anInt2538 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= local3;
			this.anInterface4Array1[arg0] = local6;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17956(arg0);
		} else {
			this.anInt2541 |= local3;
		}
	}

	@OriginalMember(owner = "client!aky", name = "m", descriptor = "(Lclient!dr;)V", line = 64)
	@Override
	public void method20880(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface4 local2 = (Interface4) arg0;
		if (arg0 == null) {
			this.anInt2540 &= 0xFFFFFFEF;
			this.anInterface4_1 = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | 0x10) == 16) {
				this.anInt2538 = local2.method27212();
				this.anInt2539 = local2.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local2.method27217() || this.anInt2538 != local2.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= 0x10;
			this.anInterface4_1 = local2;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17947();
		} else {
			this.anInt2541 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aky", name = "at", descriptor = "(Lclient!dr;)V", line = 64)
	@Override
	public void method20888(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface4 local2 = (Interface4) arg0;
		if (arg0 == null) {
			this.anInt2540 &= 0xFFFFFFEF;
			this.anInterface4_1 = null;
			if (this.anInt2540 == 0) {
				this.anInt2538 = 0;
				this.anInt2539 = 0;
			}
		} else {
			if ((this.anInt2540 | 0x10) == 16) {
				this.anInt2538 = local2.method27212();
				this.anInt2539 = local2.method27217();
				if (this.aClass21_Sub2_33.method17037() == this) {
					this.aClass21_Sub2_33.method4029();
				}
			} else if (this.anInt2539 != local2.method27217() || this.anInt2538 != local2.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2540 |= 0x10;
			this.anInterface4_1 = local2;
		}
		if (this.aClass21_Sub2_33.method17037() == this) {
			this.method17947();
		} else {
			this.anInt2541 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aky", name = "as", descriptor = "(I)V", line = 92)
	void method17952(@OriginalArg(0) int arg0) {
		@Pc(4) Interface4 local4 = this.anInterface4Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method22071(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aky", name = "ah", descriptor = "(I)V", line = 92)
	void method17956(@OriginalArg(0) int arg0) {
		@Pc(4) Interface4 local4 = this.anInterface4Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method22071(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aky", name = "an", descriptor = "()V", line = 100)
	void method17947() {
		if (this.anInterface4_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface4_1.method22071(36096);
		}
	}

	@OriginalMember(owner = "client!aky", name = "ai", descriptor = "()V", line = 100)
	void method17953() {
		if (this.anInterface4_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface4_1.method22071(36096);
		}
	}

	@OriginalMember(owner = "client!aky", name = "aq", descriptor = "()V", line = 100)
	void method17954() {
		if (this.anInterface4_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface4_1.method22071(36096);
		}
	}

	@OriginalMember(owner = "client!aky", name = "t", descriptor = "()Z", line = 107)
	@Override
	public boolean method20883() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aky", name = "af", descriptor = "()Z", line = 107)
	@Override
	public boolean method20889() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aky", name = "l", descriptor = "()Z", line = 115)
	@Override
	boolean method21393() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2542);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2541 & 0x1 << local5) != 0) {
				this.method17956(local5);
			}
		}
		if ((this.anInt2541 & 0x10) != 0) {
			this.method17947();
		}
		this.anInt2541 = 0;
		this.aClass21_Sub2_33.method4028();
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "u", descriptor = "()Z", line = 115)
	@Override
	boolean method21396() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2542);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2541 & 0x1 << local5) != 0) {
				this.method17956(local5);
			}
		}
		if ((this.anInt2541 & 0x10) != 0) {
			this.method17947();
		}
		this.anInt2541 = 0;
		this.aClass21_Sub2_33.method4028();
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "y", descriptor = "()Z", line = 115)
	@Override
	boolean method21397() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2542);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2541 & 0x1 << local5) != 0) {
				this.method17956(local5);
			}
		}
		if ((this.anInt2541 & 0x10) != 0) {
			this.method17947();
		}
		this.anInt2541 = 0;
		this.aClass21_Sub2_33.method4028();
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "h", descriptor = "()Z", line = 126)
	@Override
	boolean method21400() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "c", descriptor = "()Z", line = 126)
	@Override
	boolean method21399() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "b", descriptor = "()Z", line = 126)
	@Override
	boolean method21403() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "z", descriptor = "()Z", line = 126)
	@Override
	boolean method21398() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "j", descriptor = "()Z", line = 126)
	@Override
	boolean method21401() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aky", name = "az", descriptor = "(I)V", line = 131)
	void method17948(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aky", name = "aj", descriptor = "(I)V", line = 131)
	void method17949(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aky", name = "ax", descriptor = "(I)V", line = 131)
	void method17950(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aky", name = "av", descriptor = "(I)V", line = 131)
	void method17955(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aky", name = "al", descriptor = "(I)V", line = 131)
	void method17957(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aky", name = "w", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2538;
		@Pc(12) int local12 = this.aClass21_Sub2_33.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2542);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aky", name = "ak", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2538;
		@Pc(12) int local12 = this.aClass21_Sub2_33.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2542);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aky", name = "aa", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2538;
		@Pc(12) int local12 = this.aClass21_Sub2_33.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2542);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aky", name = "g", descriptor = "()V", line = 148)
	@Override
	public void method21392() {
		if (this.anInt2542 != 0) {
			this.aClass21_Sub2_33.method4120(this.anInt2542);
			this.anInt2542 = 0;
		}
	}

	@OriginalMember(owner = "client!aky", name = "e", descriptor = "()V", line = 148)
	@Override
	public void method21406() {
		if (this.anInt2542 != 0) {
			this.aClass21_Sub2_33.method4120(this.anInt2542);
			this.anInt2542 = 0;
		}
	}

	@OriginalMember(owner = "client!aky", name = "n", descriptor = "()V", line = 148)
	@Override
	public void method21402() {
		if (this.anInt2542 != 0) {
			this.aClass21_Sub2_33.method4120(this.anInt2542);
			this.anInt2542 = 0;
		}
	}

	@OriginalMember(owner = "client!aky", name = "r", descriptor = "()V", line = 148)
	@Override
	public void method21395() {
		if (this.anInt2542 != 0) {
			this.aClass21_Sub2_33.method4120(this.anInt2542);
			this.anInt2542 = 0;
		}
	}

	@OriginalMember(owner = "client!aky", name = "finalize", descriptor = "()V", line = 155)
	@Override
	void finalize() throws Throwable {
		super.finalize();
		this.method21392();
	}

	@OriginalMember(owner = "client!aky", name = "hh", descriptor = "()V", line = 155)
	void method17951() throws Throwable {
		super.finalize();
		this.method21392();
	}
}
