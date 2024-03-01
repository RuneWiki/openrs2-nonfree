package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aod")
public class Class19_Sub1_Sub1_Sub1 extends Class19_Sub1_Sub1 {

	@OriginalMember(owner = "client!aod", name = "g", descriptor = "I")
	static final int anInt2831 = 16;

	@OriginalMember(owner = "client!aod", name = "u", descriptor = "I")
	int anInt2828;

	@OriginalMember(owner = "client!aod", name = "x", descriptor = "I")
	int anInt2830;

	@OriginalMember(owner = "client!aod", name = "s", descriptor = "I")
	int anInt2832;

	@OriginalMember(owner = "client!aod", name = "y", descriptor = "I")
	int anInt2833;

	@OriginalMember(owner = "client!aod", name = "b", descriptor = "Lclient!og;")
	Interface40 anInterface40_1;

	@OriginalMember(owner = "client!aod", name = "c", descriptor = "[Lclient!og;")
	final Interface40[] anInterface40Array1 = new Interface40[4];

	@OriginalMember(owner = "client!aod", name = "l", descriptor = "Lclient!akk;")
	final Class21_Sub3_Sub1 aClass21_Sub3_Sub1_10;

	@OriginalMember(owner = "client!aod", name = "h", descriptor = "I")
	int anInt2829;

	@OriginalMember(owner = "client!aod", name = "<init>", descriptor = "(Lclient!akk;)V", line = 21)
	Class19_Sub1_Sub1_Sub1(@OriginalArg(0) Class21_Sub3_Sub1 arg0) {
		super(arg0);
		this.aClass21_Sub3_Sub1_10 = arg0;
		@Pc(12) int[] local12 = new int[1];
		if (!this.aClass21_Sub3_Sub1_10.aBoolean443) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, local12, 0);
		this.anInt2829 = local12[0];
	}

	@OriginalMember(owner = "client!aod", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method21390() {
		return this.anInt2830;
	}

	@OriginalMember(owner = "client!aod", name = "q", descriptor = "()I", line = 30)
	@Override
	public int method21389() {
		return this.anInt2830;
	}

	@OriginalMember(owner = "client!aod", name = "d", descriptor = "()I", line = 30)
	@Override
	public int method21405() {
		return this.anInt2830;
	}

	@OriginalMember(owner = "client!aod", name = "a", descriptor = "()I", line = 34)
	@Override
	public int method21391() {
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!aod", name = "x", descriptor = "()I", line = 34)
	@Override
	public int method21394() {
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!aod", name = "s", descriptor = "()I", line = 34)
	@Override
	public int method21404() {
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!aod", name = "v", descriptor = "(ILclient!da;)V", line = 38)
	@Override
	public void method20882(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface40 local6 = (Interface40) arg1;
		if (arg1 == null) {
			this.anInt2828 &= ~local3;
			this.anInterface40Array1[arg0] = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local6.method27212();
				this.anInt2830 = local6.method27217();
				this.method20893();
			} else if (this.anInt2830 != local6.method27217() || this.anInt2832 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= local3;
			this.anInterface40Array1[arg0] = local6;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20717(arg0);
		} else {
			this.anInt2833 |= local3;
		}
	}

	@OriginalMember(owner = "client!aod", name = "o", descriptor = "(ILclient!da;)V", line = 38)
	@Override
	public void method20887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface40 local6 = (Interface40) arg1;
		if (arg1 == null) {
			this.anInt2828 &= ~local3;
			this.anInterface40Array1[arg0] = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local6.method27212();
				this.anInt2830 = local6.method27217();
				this.method20893();
			} else if (this.anInt2830 != local6.method27217() || this.anInt2832 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= local3;
			this.anInterface40Array1[arg0] = local6;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20717(arg0);
		} else {
			this.anInt2833 |= local3;
		}
	}

	@OriginalMember(owner = "client!aod", name = "i", descriptor = "(ILclient!da;)V", line = 38)
	@Override
	public void method20891(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface40 local6 = (Interface40) arg1;
		if (arg1 == null) {
			this.anInt2828 &= ~local3;
			this.anInterface40Array1[arg0] = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local6.method27212();
				this.anInt2830 = local6.method27217();
				this.method20893();
			} else if (this.anInt2830 != local6.method27217() || this.anInt2832 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= local3;
			this.anInterface40Array1[arg0] = local6;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20717(arg0);
		} else {
			this.anInt2833 |= local3;
		}
	}

	@OriginalMember(owner = "client!aod", name = "f", descriptor = "(ILclient!da;)V", line = 38)
	@Override
	public void method20886(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface40 local6 = (Interface40) arg1;
		if (arg1 == null) {
			this.anInt2828 &= ~local3;
			this.anInterface40Array1[arg0] = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local6.method27212();
				this.anInt2830 = local6.method27217();
				this.method20893();
			} else if (this.anInt2830 != local6.method27217() || this.anInt2832 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= local3;
			this.anInterface40Array1[arg0] = local6;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20717(arg0);
		} else {
			this.anInt2833 |= local3;
		}
	}

	@OriginalMember(owner = "client!aod", name = "k", descriptor = "(ILclient!da;)V", line = 38)
	@Override
	public void method20881(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface40 local6 = (Interface40) arg1;
		if (arg1 == null) {
			this.anInt2828 &= ~local3;
			this.anInterface40Array1[arg0] = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local6.method27212();
				this.anInt2830 = local6.method27217();
				this.method20893();
			} else if (this.anInt2830 != local6.method27217() || this.anInt2832 != local6.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= local3;
			this.anInterface40Array1[arg0] = local6;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20717(arg0);
		} else {
			this.anInt2833 |= local3;
		}
	}

	@OriginalMember(owner = "client!aod", name = "m", descriptor = "(Lclient!dr;)V", line = 67)
	@Override
	public void method20880(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface40 local2 = (Interface40) arg0;
		if (arg0 == null) {
			this.anInt2828 &= 0xFFFFFFEF;
			this.anInterface40_1 = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local2.method27212();
				this.anInt2830 = local2.method27217();
				this.method20893();
			} else if (this.anInt2830 != local2.method27217() || this.anInt2832 != local2.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= 0x10;
			this.anInterface40_1 = local2;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20715();
		} else {
			this.anInt2833 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aod", name = "at", descriptor = "(Lclient!dr;)V", line = 67)
	@Override
	public void method20888(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface40 local2 = (Interface40) arg0;
		if (arg0 == null) {
			this.anInt2828 &= 0xFFFFFFEF;
			this.anInterface40_1 = null;
			if (this.anInt2828 == 0) {
				this.anInt2832 = 0;
				this.anInt2830 = 0;
			}
		} else {
			if (this.anInt2828 == 0) {
				this.anInt2832 = local2.method27212();
				this.anInt2830 = local2.method27217();
				this.method20893();
			} else if (this.anInt2830 != local2.method27217() || this.anInt2832 != local2.method27212()) {
				throw new RuntimeException();
			}
			this.anInt2828 |= 0x10;
			this.anInterface40_1 = local2;
		}
		if (this.aClass21_Sub3_Sub1_10.method17037() == this) {
			this.method20715();
		} else {
			this.anInt2833 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!aod", name = "az", descriptor = "(I)V", line = 95)
	void method20717(@OriginalArg(0) int arg0) {
		@Pc(4) Interface40 local4 = this.anInterface40Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method27220(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aod", name = "ao", descriptor = "(I)V", line = 95)
	void method20718(@OriginalArg(0) int arg0) {
		@Pc(4) Interface40 local4 = this.anInterface40Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method27220(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!aod", name = "al", descriptor = "()V", line = 103)
	void method20715() {
		if (this.anInterface40_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface40_1.method27220(36096);
		}
	}

	@OriginalMember(owner = "client!aod", name = "t", descriptor = "()Z", line = 110)
	@Override
	public boolean method20883() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aod", name = "af", descriptor = "()Z", line = 110)
	@Override
	public boolean method20889() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!aod", name = "l", descriptor = "()Z", line = 118)
	@Override
	boolean method21393() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2829);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2833 & 0x1 << local5) != 0) {
				this.method20717(local5);
			}
		}
		if ((this.anInt2833 & 0x10) != 0) {
			this.method20715();
		}
		this.anInt2833 = 0;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aod", name = "u", descriptor = "()Z", line = 118)
	@Override
	boolean method21396() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2829);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2833 & 0x1 << local5) != 0) {
				this.method20717(local5);
			}
		}
		if ((this.anInt2833 & 0x10) != 0) {
			this.method20715();
		}
		this.anInt2833 = 0;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aod", name = "y", descriptor = "()Z", line = 118)
	@Override
	boolean method21397() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2829);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2833 & 0x1 << local5) != 0) {
				this.method20717(local5);
			}
		}
		if ((this.anInt2833 & 0x10) != 0) {
			this.method20715();
		}
		this.anInt2833 = 0;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aod", name = "z", descriptor = "()Z", line = 128)
	@Override
	boolean method21398() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aod", name = "b", descriptor = "()Z", line = 128)
	@Override
	boolean method21403() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aod", name = "c", descriptor = "()Z", line = 128)
	@Override
	boolean method21399() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aod", name = "j", descriptor = "()Z", line = 128)
	@Override
	boolean method21401() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aod", name = "h", descriptor = "()Z", line = 128)
	@Override
	boolean method21400() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!aod", name = "ak", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2832;
		@Pc(12) int local12 = this.aClass21_Sub3_Sub1_10.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2829);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aod", name = "aa", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2832;
		@Pc(12) int local12 = this.aClass21_Sub3_Sub1_10.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2829);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aod", name = "w", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2832;
		@Pc(12) int local12 = this.aClass21_Sub3_Sub1_10.method17037().method21391();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2829);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!aod", name = "g", descriptor = "()V", line = 146)
	@Override
	public void method21392() {
		if (this.anInt2829 != 0) {
			this.aClass21_Sub3_Sub1_10.method16349(this.anInt2829);
			this.anInt2829 = 0;
		}
	}

	@OriginalMember(owner = "client!aod", name = "n", descriptor = "()V", line = 146)
	@Override
	public void method21402() {
		if (this.anInt2829 != 0) {
			this.aClass21_Sub3_Sub1_10.method16349(this.anInt2829);
			this.anInt2829 = 0;
		}
	}

	@OriginalMember(owner = "client!aod", name = "e", descriptor = "()V", line = 146)
	@Override
	public void method21406() {
		if (this.anInt2829 != 0) {
			this.aClass21_Sub3_Sub1_10.method16349(this.anInt2829);
			this.anInt2829 = 0;
		}
	}

	@OriginalMember(owner = "client!aod", name = "r", descriptor = "()V", line = 146)
	@Override
	public void method21395() {
		if (this.anInt2829 != 0) {
			this.aClass21_Sub3_Sub1_10.method16349(this.anInt2829);
			this.anInt2829 = 0;
		}
	}

	@OriginalMember(owner = "client!aod", name = "hh", descriptor = "()V", line = 153)
	void method20716() throws Throwable {
		super.finalize();
		this.method21392();
	}

	@OriginalMember(owner = "client!aod", name = "finalize", descriptor = "()V", line = 153)
	@Override
	void finalize() throws Throwable {
		super.finalize();
		this.method21392();
	}
}
