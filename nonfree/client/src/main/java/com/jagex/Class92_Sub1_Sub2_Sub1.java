package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asm")
public class Class92_Sub1_Sub2_Sub1 extends Class92_Sub1_Sub2 {

	@OriginalMember(owner = "client!asm", name = "v", descriptor = "I")
	static final int anInt3143 = 16;

	@OriginalMember(owner = "client!asm", name = "t", descriptor = "I")
	int anInt3144;

	@OriginalMember(owner = "client!asm", name = "q", descriptor = "Z")
	boolean aBoolean507;

	@OriginalMember(owner = "client!asm", name = "y", descriptor = "I")
	int anInt3145;

	@OriginalMember(owner = "client!asm", name = "w", descriptor = "I")
	int anInt3146;

	@OriginalMember(owner = "client!asm", name = "x", descriptor = "Lclient!nq;")
	Interface50 anInterface50_1 = null;

	@OriginalMember(owner = "client!asm", name = "d", descriptor = "[Lclient!oc;")
	final Interface52[] anInterface52Array1 = new Interface52[4];

	@OriginalMember(owner = "client!asm", name = "l", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_10;

	@OriginalMember(owner = "client!asm", name = "<init>", descriptor = "(Lclient!apn;)V", line = 20)
	Class92_Sub1_Sub2_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass86_Sub1_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!asm", name = "p", descriptor = "()I", line = 25)
	@Override
	public int method23491() {
		return this.anInt3145;
	}

	@OriginalMember(owner = "client!asm", name = "w", descriptor = "()I", line = 25)
	@Override
	public int method23497() {
		return this.anInt3145;
	}

	@OriginalMember(owner = "client!asm", name = "c", descriptor = "()I", line = 29)
	@Override
	public int method23493() {
		return this.anInt3146;
	}

	@OriginalMember(owner = "client!asm", name = "t", descriptor = "()I", line = 29)
	@Override
	public int method23498() {
		return this.anInt3146;
	}

	@OriginalMember(owner = "client!asm", name = "q", descriptor = "()I", line = 29)
	@Override
	public int method23499() {
		return this.anInt3146;
	}

	@OriginalMember(owner = "client!asm", name = "e", descriptor = "(Lclient!de;)V", line = 33)
	@Override
	public void method23512(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface50 local2 = (Interface50) arg0;
		if (arg0 == null) {
			this.anInt3144 &= 0xFFFFFFEF;
			this.anInterface50_1 = null;
			if (this.aBoolean507) {
				this.method23242(0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local2.method30329();
			this.anInt3145 = local2.method30324();
			this.method23526();
		} else if (this.anInt3145 != local2.method30324() || this.anInt3146 != local2.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= 0x10;
		this.anInterface50_1 = local2;
		if (this.aBoolean507) {
			this.method23242(local2.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "ai", descriptor = "(Lclient!de;)V", line = 33)
	@Override
	public void method23520(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface50 local2 = (Interface50) arg0;
		if (arg0 == null) {
			this.anInt3144 &= 0xFFFFFFEF;
			this.anInterface50_1 = null;
			if (this.aBoolean507) {
				this.method23242(0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local2.method30329();
			this.anInt3145 = local2.method30324();
			this.method23526();
		} else if (this.anInt3145 != local2.method30324() || this.anInt3146 != local2.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= 0x10;
		this.anInterface50_1 = local2;
		if (this.aBoolean507) {
			this.method23242(local2.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "aj", descriptor = "(Lclient!de;)V", line = 33)
	@Override
	public void method23511(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface50 local2 = (Interface50) arg0;
		if (arg0 == null) {
			this.anInt3144 &= 0xFFFFFFEF;
			this.anInterface50_1 = null;
			if (this.aBoolean507) {
				this.method23242(0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local2.method30329();
			this.anInt3145 = local2.method30324();
			this.method23526();
		} else if (this.anInt3145 != local2.method30324() || this.anInt3146 != local2.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= 0x10;
		this.anInterface50_1 = local2;
		if (this.aBoolean507) {
			this.method23242(local2.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "ag", descriptor = "(Lclient!de;)V", line = 33)
	@Override
	public void method23521(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface50 local2 = (Interface50) arg0;
		if (arg0 == null) {
			this.anInt3144 &= 0xFFFFFFEF;
			this.anInterface50_1 = null;
			if (this.aBoolean507) {
				this.method23242(0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local2.method30329();
			this.anInt3145 = local2.method30324();
			this.method23526();
		} else if (this.anInt3145 != local2.method30324() || this.anInt3146 != local2.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= 0x10;
		this.anInterface50_1 = local2;
		if (this.aBoolean507) {
			this.method23242(local2.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "h", descriptor = "(Lclient!de;)V", line = 33)
	@Override
	public void method23519(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Interface50 local2 = (Interface50) arg0;
		if (arg0 == null) {
			this.anInt3144 &= 0xFFFFFFEF;
			this.anInterface50_1 = null;
			if (this.aBoolean507) {
				this.method23242(0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local2.method30329();
			this.anInt3145 = local2.method30324();
			this.method23526();
		} else if (this.anInt3145 != local2.method30324() || this.anInt3146 != local2.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= 0x10;
		this.anInterface50_1 = local2;
		if (this.aBoolean507) {
			this.method23242(local2.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "f", descriptor = "(ILclient!df;)V", line = 59)
	@Override
	public void method23513(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface52 local6 = (Interface52) arg1;
		if (arg1 == null) {
			this.anInt3144 &= ~local3;
			this.anInterface52Array1[arg0] = null;
			if (this.aBoolean507) {
				this.method23237(arg0, 0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local6.method30329();
			this.anInt3145 = local6.method30324();
			this.method23526();
		} else if (this.anInt3145 != local6.method30324() || this.anInt3146 != local6.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= local3;
		this.anInterface52Array1[arg0] = local6;
		if (this.aBoolean507) {
			this.method23237(arg0, local6.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "n", descriptor = "(ILclient!df;)V", line = 59)
	@Override
	public void method23516(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface52 local6 = (Interface52) arg1;
		if (arg1 == null) {
			this.anInt3144 &= ~local3;
			this.anInterface52Array1[arg0] = null;
			if (this.aBoolean507) {
				this.method23237(arg0, 0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local6.method30329();
			this.anInt3145 = local6.method30324();
			this.method23526();
		} else if (this.anInt3145 != local6.method30324() || this.anInt3146 != local6.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= local3;
		this.anInterface52Array1[arg0] = local6;
		if (this.aBoolean507) {
			this.method23237(arg0, local6.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "m", descriptor = "(ILclient!df;)V", line = 59)
	@Override
	public void method23518(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface52 local6 = (Interface52) arg1;
		if (arg1 == null) {
			this.anInt3144 &= ~local3;
			this.anInterface52Array1[arg0] = null;
			if (this.aBoolean507) {
				this.method23237(arg0, 0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local6.method30329();
			this.anInt3145 = local6.method30324();
			this.method23526();
		} else if (this.anInt3145 != local6.method30324() || this.anInt3146 != local6.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= local3;
		this.anInterface52Array1[arg0] = local6;
		if (this.aBoolean507) {
			this.method23237(arg0, local6.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "a", descriptor = "(ILclient!df;)V", line = 59)
	@Override
	public void method23517(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface52 local6 = (Interface52) arg1;
		if (arg1 == null) {
			this.anInt3144 &= ~local3;
			this.anInterface52Array1[arg0] = null;
			if (this.aBoolean507) {
				this.method23237(arg0, 0L);
			}
			if (this.anInt3144 == 0) {
				this.anInt3146 = 0;
				this.anInt3145 = 0;
			}
			return;
		}
		if (this.anInt3144 == 0) {
			this.anInt3146 = local6.method30329();
			this.anInt3145 = local6.method30324();
			this.method23526();
		} else if (this.anInt3145 != local6.method30324() || this.anInt3146 != local6.method30329()) {
			throw new RuntimeException();
		}
		this.anInt3144 |= local3;
		this.anInterface52Array1[arg0] = local6;
		if (this.aBoolean507) {
			this.method23237(arg0, local6.method29383());
		}
	}

	@OriginalMember(owner = "client!asm", name = "av", descriptor = "(IJ)Z", line = 86)
	boolean method23237(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method27710(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, arg0, arg1));
	}

	@OriginalMember(owner = "client!asm", name = "ah", descriptor = "(IJ)Z", line = 86)
	boolean method23238(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method27710(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, arg0, arg1));
	}

	@OriginalMember(owner = "client!asm", name = "as", descriptor = "(IJ)Z", line = 86)
	boolean method23239(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method27710(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, arg0, arg1));
	}

	@OriginalMember(owner = "client!asm", name = "aq", descriptor = "(IJ)Z", line = 86)
	boolean method23240(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method27710(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, arg0, arg1));
	}

	@OriginalMember(owner = "client!asm", name = "am", descriptor = "(IJ)Z", line = 86)
	boolean method23241(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		return p.method27710(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, arg0, arg1));
	}

	@OriginalMember(owner = "client!asm", name = "at", descriptor = "(J)Z", line = 90)
	boolean method23242(@OriginalArg(0) long arg0) {
		return p.method27710(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_10.aLong119, arg0));
	}

	@OriginalMember(owner = "client!asm", name = "al", descriptor = "()Z", line = 94)
	@Override
	public boolean method23522() {
		return this.anInterface52Array1[0] != null;
	}

	@OriginalMember(owner = "client!asm", name = "ao", descriptor = "()Z", line = 94)
	@Override
	public boolean method23523() {
		return this.anInterface52Array1[0] != null;
	}

	@OriginalMember(owner = "client!asm", name = "o", descriptor = "()Z", line = 94)
	@Override
	public boolean method23514() {
		return this.anInterface52Array1[0] != null;
	}

	@OriginalMember(owner = "client!asm", name = "l", descriptor = "()Z", line = 98)
	@Override
	boolean method23508() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29383();
				this.method23237(local1, local14);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(this.anInterface50_1.method29383());
		}
		this.aBoolean507 = true;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asm", name = "r", descriptor = "()Z", line = 98)
	@Override
	boolean method23495() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29383();
				this.method23237(local1, local14);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(this.anInterface50_1.method29383());
		}
		this.aBoolean507 = true;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asm", name = "x", descriptor = "()Z", line = 98)
	@Override
	boolean method23500() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29383();
				this.method23237(local1, local14);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(this.anInterface50_1.method29383());
		}
		this.aBoolean507 = true;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asm", name = "d", descriptor = "()Z", line = 98)
	@Override
	boolean method23492() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29383();
				this.method23237(local1, local14);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(this.anInterface50_1.method29383());
		}
		this.aBoolean507 = true;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asm", name = "s", descriptor = "()Z", line = 98)
	@Override
	boolean method23494() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				@Pc(14) long local14 = local9.method29383();
				this.method23237(local1, local14);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(this.anInterface50_1.method29383());
		}
		this.aBoolean507 = true;
		return super.method23508();
	}

	@OriginalMember(owner = "client!asm", name = "y", descriptor = "()Z", line = 111)
	@Override
	boolean method23496() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				this.method23237(local1, 0L);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(0L);
		}
		this.aBoolean507 = false;
		return true;
	}

	@OriginalMember(owner = "client!asm", name = "g", descriptor = "()Z", line = 111)
	@Override
	boolean method23503() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				this.method23237(local1, 0L);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(0L);
		}
		this.aBoolean507 = false;
		return true;
	}

	@OriginalMember(owner = "client!asm", name = "j", descriptor = "()Z", line = 111)
	@Override
	boolean method23505() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				this.method23237(local1, 0L);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(0L);
		}
		this.aBoolean507 = false;
		return true;
	}

	@OriginalMember(owner = "client!asm", name = "z", descriptor = "()Z", line = 111)
	@Override
	boolean method23504() {
		for (@Pc(1) int local1 = 1; local1 < 4; local1++) {
			@Pc(9) Interface52 local9 = this.anInterface52Array1[local1];
			if (local9 != null) {
				this.method23237(local1, 0L);
			}
		}
		if (this.anInterface50_1 != null) {
			this.method23242(0L);
		}
		this.aBoolean507 = false;
		return true;
	}

	@OriginalMember(owner = "client!asm", name = "ak", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, 0);
			IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_10.aLong119, this.anInterface52Array1[0].method29383(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!asm", name = "au", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, 0);
			IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_10.aLong119, this.anInterface52Array1[0].method29383(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!asm", name = "b", descriptor = "(IIIIIIZZ)V", line = 121)
	@Override
	public void method23515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (arg6) {
			@Pc(7) long local7 = IDirect3DDevice.GetRenderTarget(this.aClass86_Sub1_Sub1_10.aLong119, 0);
			IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_10.aLong119, this.anInterface52Array1[0].method29383(), arg0, arg1, arg2, arg3, local7, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(local7);
		}
	}

	@OriginalMember(owner = "client!asm", name = "i", descriptor = "()V", line = 129)
	@Override
	public void method23502() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method30322();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method30322();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "v", descriptor = "()V", line = 129)
	@Override
	public void method23506() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method30322();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method30322();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "k", descriptor = "()V", line = 129)
	@Override
	public void method23507() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method30322();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method30322();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "u", descriptor = "()V", line = 129)
	@Override
	public void method23501() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method30322();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method30322();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "ay", descriptor = "()V", line = 134)
	void method23243() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method29376();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method29376();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "ae", descriptor = "()V", line = 134)
	void method23244() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method29376();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method29376();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "af", descriptor = "()V", line = 134)
	void method23245() {
		if (this.anInterface50_1 != null) {
			this.anInterface50_1.method29376();
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInterface52Array1.length; local7++) {
			if (this.anInterface52Array1[local7] != null) {
				this.anInterface52Array1[local7].method29376();
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "finalize", descriptor = "()V", line = 139)
	@Override
	void finalize() throws Throwable {
		this.method23244();
		super.finalize();
	}

	@OriginalMember(owner = "client!asm", name = "hp", descriptor = "()V", line = 139)
	void method23246() throws Throwable {
		this.method23244();
		super.finalize();
	}

	@OriginalMember(owner = "client!asm", name = "hc", descriptor = "()V", line = 139)
	void method23247() throws Throwable {
		this.method23244();
		super.finalize();
	}

	@OriginalMember(owner = "client!asm", name = "hd", descriptor = "()V", line = 139)
	void method23248() throws Throwable {
		this.method23244();
		super.finalize();
	}
}
