package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ny")
public class Class432 implements Interface52, Interface50 {

	@OriginalMember(owner = "client!ny", name = "v", descriptor = "J")
	long aLong272;

	@OriginalMember(owner = "client!ny", name = "p", descriptor = "I")
	final int anInt4908;

	@OriginalMember(owner = "client!ny", name = "c", descriptor = "Lclient!ahd;")
	final Class116_Sub1_Sub1 aClass116_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ny", name = "<init>", descriptor = "(Lclient!ahd;I)V", line = 101)
	Class432(@OriginalArg(0) Class116_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt4908 = arg1;
		this.aClass116_Sub1_Sub1_1 = arg0;
		this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method20382(this);
	}

	@OriginalMember(owner = "client!ny", name = "p", descriptor = "()I", line = 108)
	@Override
	public int method30324() {
		return this.aClass116_Sub1_Sub1_1.method10631();
	}

	@OriginalMember(owner = "client!ny", name = "l", descriptor = "()I", line = 108)
	@Override
	public int method30325() {
		return this.aClass116_Sub1_Sub1_1.method10631();
	}

	@OriginalMember(owner = "client!ny", name = "y", descriptor = "()I", line = 108)
	@Override
	public int method30326() {
		return this.aClass116_Sub1_Sub1_1.method10631();
	}

	@OriginalMember(owner = "client!ny", name = "t", descriptor = "()I", line = 112)
	@Override
	public int method30328() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "q", descriptor = "()I", line = 112)
	@Override
	public int method30330() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "x", descriptor = "()I", line = 112)
	@Override
	public int method30327() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "d", descriptor = "()I", line = 112)
	@Override
	public int method30331() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "w", descriptor = "()I", line = 112)
	@Override
	public int method30323() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "c", descriptor = "()I", line = 112)
	@Override
	public int method30329() {
		return this.aClass116_Sub1_Sub1_1.method10603();
	}

	@OriginalMember(owner = "client!ny", name = "z", descriptor = "()J", line = 116)
	@Override
	public long method29383() {
		if (this.aLong272 == 0L) {
			this.aLong272 = IDirect3DTexture.GetSurfaceLevel(this.aClass116_Sub1_Sub1_1.aLong42, this.anInt4908);
		}
		return this.aLong272;
	}

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "()J", line = 116)
	@Override
	public long method29377() {
		if (this.aLong272 == 0L) {
			this.aLong272 = IDirect3DTexture.GetSurfaceLevel(this.aClass116_Sub1_Sub1_1.aLong42, this.anInt4908);
		}
		return this.aLong272;
	}

	@OriginalMember(owner = "client!ny", name = "k", descriptor = "()J", line = 116)
	@Override
	public long method29379() {
		if (this.aLong272 == 0L) {
			this.aLong272 = IDirect3DTexture.GetSurfaceLevel(this.aClass116_Sub1_Sub1_1.aLong42, this.anInt4908);
		}
		return this.aLong272;
	}

	@OriginalMember(owner = "client!ny", name = "i", descriptor = "()J", line = 116)
	@Override
	public long method29378() {
		if (this.aLong272 == 0L) {
			this.aLong272 = IDirect3DTexture.GetSurfaceLevel(this.aClass116_Sub1_Sub1_1.aLong42, this.anInt4908);
		}
		return this.aLong272;
	}

	@OriginalMember(owner = "client!ny", name = "r", descriptor = "()V", line = 121)
	@Override
	public void method30321() {
		if (this.aLong272 != 0L) {
			IUnknown.Release(this.aLong272);
			this.aLong272 = 0L;
		}
		this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!ny", name = "g", descriptor = "()V", line = 121)
	@Override
	public void method30319() {
		if (this.aLong272 != 0L) {
			IUnknown.Release(this.aLong272);
			this.aLong272 = 0L;
		}
		this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!ny", name = "s", descriptor = "()V", line = 121)
	@Override
	public void method30320() {
		if (this.aLong272 != 0L) {
			IUnknown.Release(this.aLong272);
			this.aLong272 = 0L;
		}
		this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!ny", name = "v", descriptor = "()V", line = 121)
	@Override
	public void method30322() {
		if (this.aLong272 != 0L) {
			IUnknown.Release(this.aLong272);
			this.aLong272 = 0L;
		}
		this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!ny", name = "e", descriptor = "()V", line = 129)
	@Override
	public void method29381() {
		if (this.aLong272 != 0L) {
			this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method19590(this.aLong272);
			this.aLong272 = 0L;
		}
	}

	@OriginalMember(owner = "client!ny", name = "j", descriptor = "()V", line = 129)
	@Override
	public void method29376() {
		if (this.aLong272 != 0L) {
			this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method19590(this.aLong272);
			this.aLong272 = 0L;
		}
	}

	@OriginalMember(owner = "client!ny", name = "o", descriptor = "()V", line = 129)
	@Override
	public void method29382() {
		if (this.aLong272 != 0L) {
			this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method19590(this.aLong272);
			this.aLong272 = 0L;
		}
	}

	@OriginalMember(owner = "client!ny", name = "f", descriptor = "()V", line = 129)
	@Override
	public void method29380() {
		if (this.aLong272 != 0L) {
			this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method19590(this.aLong272);
			this.aLong272 = 0L;
		}
	}

	@OriginalMember(owner = "client!ny", name = "b", descriptor = "()V", line = 129)
	@Override
	public void method29375() {
		if (this.aLong272 != 0L) {
			this.aClass116_Sub1_Sub1_1.aClass86_Sub1_Sub1_8.method19590(this.aLong272);
			this.aLong272 = 0L;
		}
	}

	@OriginalMember(owner = "client!ny", name = "hc", descriptor = "()V", line = 136)
	void method28864() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ny", name = "finalize", descriptor = "()V", line = 136)
	@Override
	void finalize() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ny", name = "hp", descriptor = "()V", line = 136)
	void method28865() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ny", name = "hd", descriptor = "()V", line = 136)
	void method28866() {
		this.method29376();
	}
}
