package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoj")
public class Class19_Sub1_Sub1_Sub2 extends Class19_Sub1_Sub1 {

	@OriginalMember(owner = "client!aoj", name = "g", descriptor = "I")
	static final int anInt2846 = 16;

	@OriginalMember(owner = "client!aoj", name = "u", descriptor = "Z")
	boolean aBoolean499;

	@OriginalMember(owner = "client!aoj", name = "h", descriptor = "I")
	int anInt2843;

	@OriginalMember(owner = "client!aoj", name = "x", descriptor = "I")
	int anInt2844;

	@OriginalMember(owner = "client!aoj", name = "s", descriptor = "I")
	int anInt2845;

	@OriginalMember(owner = "client!aoj", name = "y", descriptor = "Lclient!lz;")
	Interface36 anInterface36_1 = null;

	@OriginalMember(owner = "client!aoj", name = "b", descriptor = "[Lclient!lo;")
	final Interface35[] anInterface35Array1 = new Interface35[4];

	@OriginalMember(owner = "client!aoj", name = "l", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_10;

	@OriginalMember(owner = "client!aoj", name = "<init>", descriptor = "(Lclient!akw;)V", line = 20)
	Class19_Sub1_Sub1_Sub2(@OriginalArg(0) Class21_Sub3_Sub2 arg0) {
		super(arg0);
		this.aClass21_Sub3_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!aoj", name = "p", descriptor = "()I", line = 25)
	@Override
	public int method21390() {
		return this.anInt2843;
	}

	@OriginalMember(owner = "client!aoj", name = "d", descriptor = "()I", line = 25)
	@Override
	public int method21405() {
		return this.anInt2843;
	}

	@OriginalMember(owner = "client!aoj", name = "q", descriptor = "()I", line = 25)
	@Override
	public int method21389() {
		return this.anInt2843;
	}

	@OriginalMember(owner = "client!aoj", name = "a", descriptor = "()I", line = 29)
	@Override
	public int method21391() {
		return this.anInt2844;
	}

	@OriginalMember(owner = "client!aoj", name = "s", descriptor = "()I", line = 29)
	@Override
	public int method21404() {
		return this.anInt2844;
	}

	@OriginalMember(owner = "client!aoj", name = "x", descriptor = "()I", line = 29)
	@Override
	public int method21394() {
		return this.anInt2844;
	}

	@OriginalMember(owner = "client!aoj", name = "m", descriptor = "(Lclient!dr;)V", line = 33)
	@Override
	public void method20880(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface36 local2 = (Interface36) arg0;
		if (arg0 == null) {
			this.anInt2845 &= 0xFFFFFFEF;
			this.anInterface36_1 = null;
			if (this.aBoolean499) {
				this.method20901(0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local2.method27212();
			this.anInt2843 = local2.method27217();
			this.method20893();
		} else if (this.anInt2843 != local2.method27217() || this.anInt2844 != local2.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= 0x10;
		this.anInterface36_1 = local2;
		if (this.aBoolean499) {
			this.method20901(local2.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "at", descriptor = "(Lclient!dr;)V", line = 33)
	@Override
	public void method20888(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Interface36 local2 = (Interface36) arg0;
		if (arg0 == null) {
			this.anInt2845 &= 0xFFFFFFEF;
			this.anInterface36_1 = null;
			if (this.aBoolean499) {
				this.method20901(0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local2.method27212();
			this.anInt2843 = local2.method27217();
			this.method20893();
		} else if (this.anInt2843 != local2.method27217() || this.anInt2844 != local2.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= 0x10;
		this.anInterface36_1 = local2;
		if (this.aBoolean499) {
			this.method20901(local2.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "v", descriptor = "(ILclient!da;)V", line = 59)
	@Override
	public void method20882(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface35 local6 = (Interface35) arg1;
		if (arg1 == null) {
			this.anInt2845 &= ~local3;
			this.anInterface35Array1[arg0] = null;
			if (this.aBoolean499) {
				this.method20903(arg0, 0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local6.method27212();
			this.anInt2843 = local6.method27217();
			this.method20893();
		} else if (this.anInt2843 != local6.method27217() || this.anInt2844 != local6.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= local3;
		this.anInterface35Array1[arg0] = local6;
		if (this.aBoolean499) {
			this.method20903(arg0, local6.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "f", descriptor = "(ILclient!da;)V", line = 59)
	@Override
	public void method20886(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface35 local6 = (Interface35) arg1;
		if (arg1 == null) {
			this.anInt2845 &= ~local3;
			this.anInterface35Array1[arg0] = null;
			if (this.aBoolean499) {
				this.method20903(arg0, 0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local6.method27212();
			this.anInt2843 = local6.method27217();
			this.method20893();
		} else if (this.anInt2843 != local6.method27217() || this.anInt2844 != local6.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= local3;
		this.anInterface35Array1[arg0] = local6;
		if (this.aBoolean499) {
			this.method20903(arg0, local6.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "o", descriptor = "(ILclient!da;)V", line = 59)
	@Override
	public void method20887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface35 local6 = (Interface35) arg1;
		if (arg1 == null) {
			this.anInt2845 &= ~local3;
			this.anInterface35Array1[arg0] = null;
			if (this.aBoolean499) {
				this.method20903(arg0, 0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local6.method27212();
			this.anInt2843 = local6.method27217();
			this.method20893();
		} else if (this.anInt2843 != local6.method27217() || this.anInt2844 != local6.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= local3;
		this.anInterface35Array1[arg0] = local6;
		if (this.aBoolean499) {
			this.method20903(arg0, local6.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "i", descriptor = "(ILclient!da;)V", line = 59)
	@Override
	public void method20891(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface35 local6 = (Interface35) arg1;
		if (arg1 == null) {
			this.anInt2845 &= ~local3;
			this.anInterface35Array1[arg0] = null;
			if (this.aBoolean499) {
				this.method20903(arg0, 0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local6.method27212();
			this.anInt2843 = local6.method27217();
			this.method20893();
		} else if (this.anInt2843 != local6.method27217() || this.anInt2844 != local6.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= local3;
		this.anInterface35Array1[arg0] = local6;
		if (this.aBoolean499) {
			this.method20903(arg0, local6.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "k", descriptor = "(ILclient!da;)V", line = 59)
	@Override
	public void method20881(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface35 local6 = (Interface35) arg1;
		if (arg1 == null) {
			this.anInt2845 &= ~local3;
			this.anInterface35Array1[arg0] = null;
			if (this.aBoolean499) {
				this.method20903(arg0, 0L);
			}
			if (this.anInt2845 == 0) {
				this.anInt2844 = 0;
				this.anInt2843 = 0;
			}
			return;
		}
		if (this.anInt2845 == 0) {
			this.anInt2844 = local6.method27212();
			this.anInt2843 = local6.method27217();
			this.method20893();
		} else if (this.anInt2843 != local6.method27217() || this.anInt2844 != local6.method27212()) {
			throw new RuntimeException();
		}
		this.anInt2845 |= local3;
		this.anInterface35Array1[arg0] = local6;
		if (this.aBoolean499) {
			this.method20903(arg0, local6.method25774());
		}
	}

	@OriginalMember(owner = "client!aoj", name = "az", descriptor = "(IJ)Z", line = 86)
	boolean method20903(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method25092(IDirect3DDevice.SetRenderTarget(this.aClass21_Sub3_Sub2_10.aLong104, arg0, arg1));
	}

	@OriginalMember(owner = "client!aoj", name = "ap", descriptor = "(IJ)Z", line = 86)
	boolean method20906(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method25092(IDirect3DDevice.SetRenderTarget(this.aClass21_Sub3_Sub2_10.aLong104, arg0, arg1));
	}

	@OriginalMember(owner = "client!aoj", name = "al", descriptor = "(J)Z", line = 90)
	boolean method20901(@OriginalArg(0) long arg0) {
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_10.aLong104, arg0));
	}

	@OriginalMember(owner = "client!aoj", name = "af", descriptor = "()Z", line = 94)
	@Override
	public boolean method20889() {
		return this.anInterface35Array1[0] != null;
	}

	@OriginalMember(owner = "client!aoj", name = "t", descriptor = "()Z", line = 94)
	@Override
	public boolean method20883() {
		return this.anInterface35Array1[0] != null;
	}

	@OriginalMember(owner = "client!aoj", name = "l", descriptor = "()Z", line = 98)
	@Override
	boolean method21393() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method25774();
				this.method20903(local1, local14);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(this.anInterface36_1.method25774());
		}
		this.aBoolean499 = true;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aoj", name = "y", descriptor = "()Z", line = 98)
	@Override
	boolean method21397() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method25774();
				this.method20903(local1, local14);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(this.anInterface36_1.method25774());
		}
		this.aBoolean499 = true;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aoj", name = "u", descriptor = "()Z", line = 98)
	@Override
	boolean method21396() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method25774();
				this.method20903(local1, local14);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(this.anInterface36_1.method25774());
		}
		this.aBoolean499 = true;
		return super.method21393();
	}

	@OriginalMember(owner = "client!aoj", name = "b", descriptor = "()Z", line = 111)
	@Override
	boolean method21403() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				this.method20903(local1, 0L);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(0L);
		}
		this.aBoolean499 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoj", name = "c", descriptor = "()Z", line = 111)
	@Override
	boolean method21399() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				this.method20903(local1, 0L);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(0L);
		}
		this.aBoolean499 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoj", name = "z", descriptor = "()Z", line = 111)
	@Override
	boolean method21398() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				this.method20903(local1, 0L);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(0L);
		}
		this.aBoolean499 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoj", name = "j", descriptor = "()Z", line = 111)
	@Override
	boolean method21401() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				this.method20903(local1, 0L);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(0L);
		}
		this.aBoolean499 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoj", name = "h", descriptor = "()Z", line = 111)
	@Override
	boolean method21400() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface35 local9 = this.anInterface35Array1[local1];
			if (local9 != null) {
				this.method20903(local1, 0L);
			}
		}
		if (this.anInterface36_1 != null) {
			this.method20901(0L);
		}
		this.aBoolean499 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoj", name = "w", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass21_Sub3_Sub2_10.aLong104, 0);
			IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_10.aLong104, this.anInterface35Array1[0].method25774(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!aoj", name = "ak", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass21_Sub3_Sub2_10.aLong104, 0);
			IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_10.aLong104, this.anInterface35Array1[0].method25774(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!aoj", name = "aa", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass21_Sub3_Sub2_10.aLong104, 0);
			IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_10.aLong104, this.anInterface35Array1[0].method25774(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!aoj", name = "g", descriptor = "()V", line = 129)
	@Override
	public void method21392() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method27209();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method27209();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "n", descriptor = "()V", line = 129)
	@Override
	public void method21402() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method27209();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method27209();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "e", descriptor = "()V", line = 129)
	@Override
	public void method21406() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method27209();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method27209();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "r", descriptor = "()V", line = 129)
	@Override
	public void method21395() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method27209();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method27209();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "ab", descriptor = "()V", line = 134)
	void method20902() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method25771();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method25771();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "ao", descriptor = "()V", line = 134)
	void method20904() {
		if (this.anInterface36_1 != null) {
			this.anInterface36_1.method25771();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface35Array1.length; local7++) {
			if (this.anInterface35Array1[local7] != null) {
				this.anInterface35Array1[local7].method25771();
			}
		}
	}

	@OriginalMember(owner = "client!aoj", name = "finalize", descriptor = "()V", line = 139)
	@Override
	void finalize() throws Throwable {
		this.method20904();
		super.finalize();
	}

	@OriginalMember(owner = "client!aoj", name = "hh", descriptor = "()V", line = 139)
	void method20905() throws Throwable {
		this.method20904();
		super.finalize();
	}
}
