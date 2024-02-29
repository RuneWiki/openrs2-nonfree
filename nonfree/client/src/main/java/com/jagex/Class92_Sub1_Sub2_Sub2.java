package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asv")
public class Class92_Sub1_Sub2_Sub2 extends Class92_Sub1_Sub2 {

	@OriginalMember(owner = "client!asv", name = "v", descriptor = "I")
	static final int anInt3170 = 16;

	@OriginalMember(owner = "client!asv", name = "d", descriptor = "Lclient!qq;")
	Interface56 anInterface56_1;

	@OriginalMember(owner = "client!asv", name = "t", descriptor = "I")
	int anInt3167;

	@OriginalMember(owner = "client!asv", name = "w", descriptor = "I")
	int anInt3168;

	@OriginalMember(owner = "client!asv", name = "x", descriptor = "I")
	int anInt3171;

	@OriginalMember(owner = "client!asv", name = "q", descriptor = "I")
	int anInt3172;

	@OriginalMember(owner = "client!asv", name = "s", descriptor = "[Lclient!qq;")
	final Interface56[] anInterface56Array1 = new Interface56[4];

	@OriginalMember(owner = "client!asv", name = "l", descriptor = "Lclient!apr;")
	final Class86_Sub1_Sub2 aClass86_Sub1_Sub2_10;

	@OriginalMember(owner = "client!asv", name = "y", descriptor = "I")
	int anInt3169;

	@OriginalMember(owner = "client!asv", name = "<init>", descriptor = "(Lclient!apr;)V", line = 21)
	Class92_Sub1_Sub2_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0) {
		super(arg0);
		this.aClass86_Sub1_Sub2_10 = arg0;
		@Pc(12) int[] local12 = new int[1];
		if (!this.aClass86_Sub1_Sub2_10.aBoolean454) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, local12, 0);
		this.anInt3169 = local12[0];
	}

	@OriginalMember(owner = "client!asv", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23491() {
		return this.anInt3168;
	}

	@OriginalMember(owner = "client!asv", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23497() {
		return this.anInt3168;
	}

	@OriginalMember(owner = "client!asv", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23493() {
		return this.anInt3167;
	}

	@OriginalMember(owner = "client!asv", name = "t", descriptor = "()I", line = 34)
	@Override
	public int method23498() {
		return this.anInt3167;
	}

	@OriginalMember(owner = "client!asv", name = "q", descriptor = "()I", line = 34)
	@Override
	public int method23499() {
		return this.anInt3167;
	}

	@OriginalMember(owner = "client!asv", name = "n", descriptor = "(ILclient!df;)V", line = 38)
	@Override
	public void method23516(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3172 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local6.method30329();
				this.anInt3168 = local6.method30324();
				this.method23526();
			} else if (this.anInt3168 != local6.method30324() || this.anInt3167 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23530(arg0);
		} else {
			this.anInt3171 |= local3;
		}
	}

	@OriginalMember(owner = "client!asv", name = "a", descriptor = "(ILclient!df;)V", line = 38)
	@Override
	public void method23517(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3172 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local6.method30329();
				this.anInt3168 = local6.method30324();
				this.method23526();
			} else if (this.anInt3168 != local6.method30324() || this.anInt3167 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23530(arg0);
		} else {
			this.anInt3171 |= local3;
		}
	}

	@OriginalMember(owner = "client!asv", name = "f", descriptor = "(ILclient!df;)V", line = 38)
	@Override
	public void method23513(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3172 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local6.method30329();
				this.anInt3168 = local6.method30324();
				this.method23526();
			} else if (this.anInt3168 != local6.method30324() || this.anInt3167 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23530(arg0);
		} else {
			this.anInt3171 |= local3;
		}
	}

	@OriginalMember(owner = "client!asv", name = "m", descriptor = "(ILclient!df;)V", line = 38)
	@Override
	public void method23518(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3172 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local6.method30329();
				this.anInt3168 = local6.method30324();
				this.method23526();
			} else if (this.anInt3168 != local6.method30324() || this.anInt3167 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23530(arg0);
		} else {
			this.anInt3171 |= local3;
		}
	}

	@OriginalMember(owner = "client!asv", name = "aj", descriptor = "(Lclient!de;)V", line = 67)
	@Override
	public void method23511(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3172 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local2.method30329();
				this.anInt3168 = local2.method30324();
				this.method23526();
			} else if (this.anInt3168 != local2.method30324() || this.anInt3167 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23535();
		} else {
			this.anInt3171 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!asv", name = "h", descriptor = "(Lclient!de;)V", line = 67)
	@Override
	public void method23519(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3172 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local2.method30329();
				this.anInt3168 = local2.method30324();
				this.method23526();
			} else if (this.anInt3168 != local2.method30324() || this.anInt3167 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23535();
		} else {
			this.anInt3171 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!asv", name = "ag", descriptor = "(Lclient!de;)V", line = 67)
	@Override
	public void method23521(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3172 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local2.method30329();
				this.anInt3168 = local2.method30324();
				this.method23526();
			} else if (this.anInt3168 != local2.method30324() || this.anInt3167 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23535();
		} else {
			this.anInt3171 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!asv", name = "ai", descriptor = "(Lclient!de;)V", line = 67)
	@Override
	public void method23520(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3172 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local2.method30329();
				this.anInt3168 = local2.method30324();
				this.method23526();
			} else if (this.anInt3168 != local2.method30324() || this.anInt3167 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23535();
		} else {
			this.anInt3171 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!asv", name = "e", descriptor = "(Lclient!de;)V", line = 67)
	@Override
	public void method23512(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3172 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3172 == 0) {
				this.anInt3167 = 0;
				this.anInt3168 = 0;
			}
		} else {
			if (this.anInt3172 == 0) {
				this.anInt3167 = local2.method30329();
				this.anInt3168 = local2.method30324();
				this.method23526();
			} else if (this.anInt3168 != local2.method30324() || this.anInt3167 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt3172 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass86_Sub1_Sub2_10.method19940() == this) {
			this.method23535();
		} else {
			this.anInt3171 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!asv", name = "av", descriptor = "(I)V", line = 95)
	void method23530(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30332(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!asv", name = "aq", descriptor = "(I)V", line = 95)
	void method23531(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30332(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!asv", name = "as", descriptor = "(I)V", line = 95)
	void method23532(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30332(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!asv", name = "ah", descriptor = "(I)V", line = 95)
	void method23533(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30332(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!asv", name = "ae", descriptor = "(I)V", line = 95)
	void method23534(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30332(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!asv", name = "at", descriptor = "()V", line = 103)
	void method23535() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30332(36096);
		}
	}

	@OriginalMember(owner = "client!asv", name = "am", descriptor = "()V", line = 103)
	void method23536() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30332(36096);
		}
	}

	@OriginalMember(owner = "client!asv", name = "ay", descriptor = "()V", line = 103)
	void method23537() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30332(36096);
		}
	}

	@OriginalMember(owner = "client!asv", name = "o", descriptor = "()Z", line = 110)
	@Override
	public boolean method23514() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!asv", name = "ao", descriptor = "()Z", line = 110)
	@Override
	public boolean method23523() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!asv", name = "al", descriptor = "()Z", line = 110)
	@Override
	public boolean method23522() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!asv", name = "s", descriptor = "()Z", line = 118)
	@Override
	boolean method23494() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3169);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3171 & 0x1 << local5) != 0) {
				this.method23530(local5);
			}
		}
		if ((this.anInt3171 & 0x10) != 0) {
			this.method23535();
		}
		this.anInt3171 = 0;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asv", name = "l", descriptor = "()Z", line = 118)
	@Override
	boolean method23508() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3169);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3171 & 0x1 << local5) != 0) {
				this.method23530(local5);
			}
		}
		if ((this.anInt3171 & 0x10) != 0) {
			this.method23535();
		}
		this.anInt3171 = 0;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asv", name = "x", descriptor = "()Z", line = 118)
	@Override
	boolean method23500() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3169);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3171 & 0x1 << local5) != 0) {
				this.method23530(local5);
			}
		}
		if ((this.anInt3171 & 0x10) != 0) {
			this.method23535();
		}
		this.anInt3171 = 0;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asv", name = "d", descriptor = "()Z", line = 118)
	@Override
	boolean method23492() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3169);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3171 & 0x1 << local5) != 0) {
				this.method23530(local5);
			}
		}
		if ((this.anInt3171 & 0x10) != 0) {
			this.method23535();
		}
		this.anInt3171 = 0;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asv", name = "r", descriptor = "()Z", line = 118)
	@Override
	boolean method23495() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3169);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3171 & 0x1 << local5) != 0) {
				this.method23530(local5);
			}
		}
		if ((this.anInt3171 & 0x10) != 0) {
			this.method23535();
		}
		this.anInt3171 = 0;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asv", name = "g", descriptor = "()Z", line = 128)
	@Override
	boolean method23503() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!asv", name = "y", descriptor = "()Z", line = 128)
	@Override
	boolean method23496() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!asv", name = "z", descriptor = "()Z", line = 128)
	@Override
	boolean method23504() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!asv", name = "j", descriptor = "()Z", line = 128)
	@Override
	boolean method23505() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!asv", name = "b", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3167;
		@Pc(12) int local12 = this.aClass86_Sub1_Sub2_10.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3169);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!asv", name = "ak", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3167;
		@Pc(12) int local12 = this.aClass86_Sub1_Sub2_10.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3169);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!asv", name = "au", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3167;
		@Pc(12) int local12 = this.aClass86_Sub1_Sub2_10.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3169);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!asv", name = "v", descriptor = "()V", line = 146)
	@Override
	public void method23506() {
		if (this.anInt3169 != 0) {
			this.aClass86_Sub1_Sub2_10.method20797(this.anInt3169);
			this.anInt3169 = 0;
		}
	}

	@OriginalMember(owner = "client!asv", name = "i", descriptor = "()V", line = 146)
	@Override
	public void method23502() {
		if (this.anInt3169 != 0) {
			this.aClass86_Sub1_Sub2_10.method20797(this.anInt3169);
			this.anInt3169 = 0;
		}
	}

	@OriginalMember(owner = "client!asv", name = "k", descriptor = "()V", line = 146)
	@Override
	public void method23507() {
		if (this.anInt3169 != 0) {
			this.aClass86_Sub1_Sub2_10.method20797(this.anInt3169);
			this.anInt3169 = 0;
		}
	}

	@OriginalMember(owner = "client!asv", name = "u", descriptor = "()V", line = 146)
	@Override
	public void method23501() {
		if (this.anInt3169 != 0) {
			this.aClass86_Sub1_Sub2_10.method20797(this.anInt3169);
			this.anInt3169 = 0;
		}
	}

	@OriginalMember(owner = "client!asv", name = "hd", descriptor = "()V", line = 153)
	void method23538() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!asv", name = "hp", descriptor = "()V", line = 153)
	void method23539() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!asv", name = "finalize", descriptor = "()V", line = 153)
	@Override
	void finalize() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!asv", name = "hc", descriptor = "()V", line = 153)
	void method23540() throws Throwable {
		super.finalize();
		this.method23506();
	}
}
