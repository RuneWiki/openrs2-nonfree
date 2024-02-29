package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aob")
public class Class92_Sub1_Sub1 extends Class92_Sub1 {

	@OriginalMember(owner = "client!aob", name = "c", descriptor = "I")
	static final int anInt2417 = 16;

	@OriginalMember(owner = "client!aob", name = "y", descriptor = "I")
	int anInt2419;

	@OriginalMember(owner = "client!aob", name = "w", descriptor = "I")
	int anInt2420;

	@OriginalMember(owner = "client!aob", name = "t", descriptor = "I")
	int anInt2421;

	@OriginalMember(owner = "client!aob", name = "q", descriptor = "I")
	int anInt2422;

	@OriginalMember(owner = "client!aob", name = "x", descriptor = "Lclient!cb;")
	Interface16 anInterface16_1;

	@OriginalMember(owner = "client!aob", name = "d", descriptor = "[Lclient!cb;")
	final Interface16[] anInterface16Array1 = new Interface16[4];

	@OriginalMember(owner = "client!aob", name = "v", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_32;

	@OriginalMember(owner = "client!aob", name = "l", descriptor = "I")
	int anInt2418;

	@OriginalMember(owner = "client!aob", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 18)
	Class92_Sub1_Sub1(@OriginalArg(0) Class86_Sub3 arg0) {
		if (!arg0.aBoolean134) {
			throw new IllegalStateException("");
		}
		this.aClass86_Sub3_32 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, local19, 0);
		this.anInt2418 = local19[0];
	}

	@OriginalMember(owner = "client!aob", name = "p", descriptor = "()I", line = 27)
	@Override
	public int method23491() {
		return this.anInt2419;
	}

	@OriginalMember(owner = "client!aob", name = "w", descriptor = "()I", line = 27)
	@Override
	public int method23497() {
		return this.anInt2419;
	}

	@OriginalMember(owner = "client!aob", name = "t", descriptor = "()I", line = 31)
	@Override
	public int method23498() {
		return this.anInt2420;
	}

	@OriginalMember(owner = "client!aob", name = "c", descriptor = "()I", line = 31)
	@Override
	public int method23493() {
		return this.anInt2420;
	}

	@OriginalMember(owner = "client!aob", name = "q", descriptor = "()I", line = 31)
	@Override
	public int method23499() {
		return this.anInt2420;
	}

	@OriginalMember(owner = "client!aob", name = "a", descriptor = "(ILclient!df;)V", line = 35)
	@Override
	public void method23517(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2421 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | local3) == local3) {
				this.anInt2420 = local6.method30329();
				this.anInt2419 = local6.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local6.method30324() || this.anInt2420 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17575(arg0);
		} else {
			this.anInt2422 |= local3;
		}
	}

	@OriginalMember(owner = "client!aob", name = "n", descriptor = "(ILclient!df;)V", line = 35)
	@Override
	public void method23516(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2421 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | local3) == local3) {
				this.anInt2420 = local6.method30329();
				this.anInt2419 = local6.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local6.method30324() || this.anInt2420 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17575(arg0);
		} else {
			this.anInt2422 |= local3;
		}
	}

	@OriginalMember(owner = "client!aob", name = "m", descriptor = "(ILclient!df;)V", line = 35)
	@Override
	public void method23518(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2421 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | local3) == local3) {
				this.anInt2420 = local6.method30329();
				this.anInt2419 = local6.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local6.method30324() || this.anInt2420 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17575(arg0);
		} else {
			this.anInt2422 |= local3;
		}
	}

	@OriginalMember(owner = "client!aob", name = "f", descriptor = "(ILclient!df;)V", line = 35)
	@Override
	public void method23513(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2421 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | local3) == local3) {
				this.anInt2420 = local6.method30329();
				this.anInt2419 = local6.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local6.method30324() || this.anInt2420 != local6.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17575(arg0);
		} else {
			this.anInt2422 |= local3;
		}
	}

	@OriginalMember(owner = "client!aob", name = "e", descriptor = "(Lclient!de;)V", line = 64)
	@Override
	public void method23512(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2421 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | 0x10) == 16) {
				this.anInt2420 = local2.method30329();
				this.anInt2419 = local2.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local2.method30324() || this.anInt2420 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17578();
		} else {
			this.anInt2422 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aob", name = "h", descriptor = "(Lclient!de;)V", line = 64)
	@Override
	public void method23519(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2421 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | 0x10) == 16) {
				this.anInt2420 = local2.method30329();
				this.anInt2419 = local2.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local2.method30324() || this.anInt2420 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17578();
		} else {
			this.anInt2422 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aob", name = "aj", descriptor = "(Lclient!de;)V", line = 64)
	@Override
	public void method23511(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2421 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | 0x10) == 16) {
				this.anInt2420 = local2.method30329();
				this.anInt2419 = local2.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local2.method30324() || this.anInt2420 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17578();
		} else {
			this.anInt2422 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aob", name = "ag", descriptor = "(Lclient!de;)V", line = 64)
	@Override
	public void method23521(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2421 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | 0x10) == 16) {
				this.anInt2420 = local2.method30329();
				this.anInt2419 = local2.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local2.method30324() || this.anInt2420 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17578();
		} else {
			this.anInt2422 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aob", name = "ai", descriptor = "(Lclient!de;)V", line = 64)
	@Override
	public void method23520(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2421 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2421 == 0) {
				this.anInt2420 = 0;
				this.anInt2419 = 0;
			}
		} else {
			if ((this.anInt2421 | 0x10) == 16) {
				this.anInt2420 = local2.method30329();
				this.anInt2419 = local2.method30324();
				if (this.aClass86_Sub3_32.method19940() == this) {
					this.aClass86_Sub3_32.method6053();
				}
			} else if (this.anInt2419 != local2.method30324() || this.anInt2420 != local2.method30329()) {
				throw new RuntimeException();
			}
			this.anInt2421 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass86_Sub3_32.method19940() == this) {
			this.method17578();
		} else {
			this.anInt2422 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aob", name = "ax", descriptor = "(I)V", line = 92)
	void method17575(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25513(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aob", name = "ac", descriptor = "(I)V", line = 92)
	void method17576(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25513(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aob", name = "av", descriptor = "()V", line = 100)
	void method17577() {
		if (this.anInterface16_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface16_1.method25513(36096);
		}
	}

	@OriginalMember(owner = "client!aob", name = "ar", descriptor = "()V", line = 100)
	void method17578() {
		if (this.anInterface16_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface16_1.method25513(36096);
		}
	}

	@OriginalMember(owner = "client!aob", name = "at", descriptor = "()V", line = 100)
	void method17579() {
		if (this.anInterface16_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface16_1.method25513(36096);
		}
	}

	@OriginalMember(owner = "client!aob", name = "o", descriptor = "()Z", line = 107)
	@Override
	public boolean method23514() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aob", name = "al", descriptor = "()Z", line = 107)
	@Override
	public boolean method23522() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aob", name = "ao", descriptor = "()Z", line = 107)
	@Override
	public boolean method23523() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aob", name = "r", descriptor = "()Z", line = 115)
	@Override
	boolean method23495() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2418);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2422 & 0x1 << local5) != 0) {
				this.method17575(local5);
			}
		}
		if ((this.anInt2422 & 0x10) != 0) {
			this.method17578();
		}
		this.anInt2422 = 0;
		this.aClass86_Sub3_32.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "l", descriptor = "()Z", line = 115)
	@Override
	boolean method23508() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2418);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2422 & 0x1 << local5) != 0) {
				this.method17575(local5);
			}
		}
		if ((this.anInt2422 & 0x10) != 0) {
			this.method17578();
		}
		this.anInt2422 = 0;
		this.aClass86_Sub3_32.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "x", descriptor = "()Z", line = 115)
	@Override
	boolean method23500() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2418);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2422 & 0x1 << local5) != 0) {
				this.method17575(local5);
			}
		}
		if ((this.anInt2422 & 0x10) != 0) {
			this.method17578();
		}
		this.anInt2422 = 0;
		this.aClass86_Sub3_32.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "d", descriptor = "()Z", line = 115)
	@Override
	boolean method23492() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2418);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2422 & 0x1 << local5) != 0) {
				this.method17575(local5);
			}
		}
		if ((this.anInt2422 & 0x10) != 0) {
			this.method17578();
		}
		this.anInt2422 = 0;
		this.aClass86_Sub3_32.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "s", descriptor = "()Z", line = 115)
	@Override
	boolean method23494() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2418);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2422 & 0x1 << local5) != 0) {
				this.method17575(local5);
			}
		}
		if ((this.anInt2422 & 0x10) != 0) {
			this.method17578();
		}
		this.anInt2422 = 0;
		this.aClass86_Sub3_32.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "y", descriptor = "()Z", line = 126)
	@Override
	boolean method23496() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "j", descriptor = "()Z", line = 126)
	@Override
	boolean method23505() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "z", descriptor = "()Z", line = 126)
	@Override
	boolean method23504() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "g", descriptor = "()Z", line = 126)
	@Override
	boolean method23503() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aob", name = "ad", descriptor = "(I)V", line = 131)
	void method17580(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aob", name = "ae", descriptor = "(I)V", line = 131)
	void method17581(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aob", name = "ah", descriptor = "(I)V", line = 131)
	void method17582(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aob", name = "as", descriptor = "(I)V", line = 131)
	void method17583(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!aob", name = "b", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2420;
		@Pc(12) int local12 = this.aClass86_Sub3_32.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2418);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aob", name = "ak", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2420;
		@Pc(12) int local12 = this.aClass86_Sub3_32.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2418);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aob", name = "au", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2420;
		@Pc(12) int local12 = this.aClass86_Sub3_32.method19940().method23493();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2418);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aob", name = "u", descriptor = "()V", line = 148)
	@Override
	public void method23501() {
		if (this.anInt2418 != 0) {
			this.aClass86_Sub3_32.method6275(this.anInt2418);
			this.anInt2418 = 0;
		}
	}

	@OriginalMember(owner = "client!aob", name = "v", descriptor = "()V", line = 148)
	@Override
	public void method23506() {
		if (this.anInt2418 != 0) {
			this.aClass86_Sub3_32.method6275(this.anInt2418);
			this.anInt2418 = 0;
		}
	}

	@OriginalMember(owner = "client!aob", name = "k", descriptor = "()V", line = 148)
	@Override
	public void method23507() {
		if (this.anInt2418 != 0) {
			this.aClass86_Sub3_32.method6275(this.anInt2418);
			this.anInt2418 = 0;
		}
	}

	@OriginalMember(owner = "client!aob", name = "i", descriptor = "()V", line = 148)
	@Override
	public void method23502() {
		if (this.anInt2418 != 0) {
			this.aClass86_Sub3_32.method6275(this.anInt2418);
			this.anInt2418 = 0;
		}
	}

	@OriginalMember(owner = "client!aob", name = "finalize", descriptor = "()V", line = 155)
	@Override
	void finalize() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!aob", name = "hc", descriptor = "()V", line = 155)
	void method17584() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!aob", name = "hd", descriptor = "()V", line = 155)
	void method17585() throws Throwable {
		super.finalize();
		this.method23506();
	}

	@OriginalMember(owner = "client!aob", name = "hp", descriptor = "()V", line = 155)
	void method17586() throws Throwable {
		super.finalize();
		this.method23506();
	}
}
