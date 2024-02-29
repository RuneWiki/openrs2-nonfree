package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abr")
public class Class42 implements Interface13 {

	@OriginalMember(owner = "client!abr", name = "y", descriptor = "Lclient!am;")
	Interface12 anInterface12_3;

	@OriginalMember(owner = "client!abr", name = "p", descriptor = "Lclient!abg;")
	final Interface5 anInterface5_22;

	@OriginalMember(owner = "client!abr", name = "c", descriptor = "Lclient!xl;")
	final Class647 aClass647_28;

	@OriginalMember(owner = "client!abr", name = "v", descriptor = "Lclient!pw;")
	final Class478 aClass478_71;

	@OriginalMember(owner = "client!abr", name = "l", descriptor = "I")
	protected int anInt2431;

	@OriginalMember(owner = "client!abr", name = "w", descriptor = "[Lclient!am;")
	Interface12[] anInterface12Array3;

	@OriginalMember(owner = "client!abr", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!xl;Lclient!pw;Lclient!abg;Z)V", line = 21)
	Class42(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class647 arg2, @OriginalArg(3) Class478 arg3, @OriginalArg(4) Interface5 arg4, @OriginalArg(5) boolean arg5) {
		this.anInterface5_22 = arg4;
		this.aClass647_28 = arg2;
		this.aClass478_71 = arg3;
		this.anInt2431 = Class27.method470(this.aClass478_71, this.aClass647_28) * 166922659;
		this.anInterface12Array3 = (Interface12[]) Array.newInstance(this.anInterface5_22.method27822(), this.anInt2431 * 317485579);
		if (arg5) {
			for (@Pc(37) int local37 = 0; local37 < this.anInt2431 * 317485579; local37++) {
				this.method17736(local37);
			}
		}
	}

	@OriginalMember(owner = "client!abr", name = "v", descriptor = "(I)Lclient!am;", line = 35)
	@Override
	public Interface12 method18315(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.anInterface5_22.method27821(-1, this);
			}
			return this.anInterface12_3;
		} else {
			if (this.anInterface12Array3[arg0] == null) {
				this.method17736(arg0);
			}
			return this.anInterface12Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!abr", name = "p", descriptor = "(II)Lclient!am;", line = 35)
	@Override
	public Interface12 method18319(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.anInterface5_22.method27821(-1, this);
			}
			return this.anInterface12_3;
		} else {
			if (this.anInterface12Array3[arg0] == null) {
				this.method17736(arg0);
			}
			return this.anInterface12Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!abr", name = "l", descriptor = "(I)Lclient!am;", line = 35)
	@Override
	public Interface12 method18314(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.anInterface5_22.method27821(-1, this);
			}
			return this.anInterface12_3;
		} else {
			if (this.anInterface12Array3[arg0] == null) {
				this.method17736(arg0);
			}
			return this.anInterface12Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!abr", name = "y", descriptor = "(I)Lclient!am;", line = 35)
	@Override
	public Interface12 method18317(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.anInterface5_22.method27821(-1, this);
			}
			return this.anInterface12_3;
		} else {
			if (this.anInterface12Array3[arg0] == null) {
				this.method17736(arg0);
			}
			return this.anInterface12Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!abr", name = "q", descriptor = "(IB)V", line = 44)
	void method17736(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface12Array3[arg0] = this.anInterface5_22.method27821(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class598.method31978(this.aClass478_71, this.aClass647_28, arg0);
		if (local31 != null) {
			this.anInterface12Array3[arg0].method36031(new Class77_Sub39(local31));
		}
		this.anInterface12Array3[arg0].method36034();
	}

	@OriginalMember(owner = "client!abr", name = "d", descriptor = "(I)V", line = 44)
	void method17737(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface12Array3[arg0] = this.anInterface5_22.method27821(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class598.method31978(this.aClass478_71, this.aClass647_28, arg0);
		if (local31 != null) {
			this.anInterface12Array3[arg0].method36031(new Class77_Sub39(local31));
		}
		this.anInterface12Array3[arg0].method36034();
	}

	@OriginalMember(owner = "client!abr", name = "x", descriptor = "(I)V", line = 44)
	void method17738(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface12Array3[arg0] = this.anInterface5_22.method27821(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class598.method31978(this.aClass478_71, this.aClass647_28, arg0);
		if (local31 != null) {
			this.anInterface12Array3[arg0].method36031(new Class77_Sub39(local31));
		}
		this.anInterface12Array3[arg0].method36034();
	}

	@OriginalMember(owner = "client!abr", name = "t", descriptor = "()I", line = 59)
	@Override
	public int method18316() {
		return this.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abr", name = "w", descriptor = "()I", line = 59)
	@Override
	public int method18313() {
		return this.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abr", name = "c", descriptor = "(B)I", line = 59)
	@Override
	public int method18318() {
		return this.anInterface12Array3.length;
	}

	@OriginalMember(owner = "client!abr", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 63)
	@Override
	public Iterator iterator() {
		return new Class45(this);
	}

	@OriginalMember(owner = "client!abr", name = "r", descriptor = "()Ljava/util/Iterator;", line = 63)
	public Iterator method17739() {
		return new Class45(this);
	}

	@OriginalMember(owner = "client!abr", name = "s", descriptor = "()Ljava/util/Iterator;", line = 63)
	public Iterator method17740() {
		return new Class45(this);
	}

	@OriginalMember(owner = "client!abr", name = "et", descriptor = "(B)V", line = 1024)
	static void method17741() {
		client.anInt3497 = 0;
		client.anInt3498 = 0;
		client.anInt3523 = 0;
		client.anInt3399 = 0;
		client.anInt3487 = 0;
		client.anInt3385 = 0;
		client.anInt3392 = 0;
		client.anInt3499 = 0;
		client.anInt3503 = 0;
		client.anInt3483 = 0;
		client.anInt3504 = 0;
		client.anInt3505 = 0;
		client.anInt3506 = 0;
		client.anInt3507 = 0;
		client.anInt3508 = 0;
	}

	@OriginalMember(owner = "client!abr", name = "te", descriptor = "(Lclient!yf;I)V", line = 8054)
	static final void method17742(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(19) Class77_Sub20 local19 = Class365.method28132(Class414.aClass414_40, client.aClass82_2.aClass16_1);
		local19.aClass77_Sub39_Sub1_2.method22403(local13.length() + 1);
		local19.aClass77_Sub39_Sub1_2.method22440(local13);
		client.aClass82_2.method2004(local19);
	}
}
