package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acd")
public class Class55 implements Interface11 {

	@OriginalMember(owner = "client!acd", name = "f", descriptor = "Lclient!ay;")
	Interface13 anInterface13_3;

	@OriginalMember(owner = "client!acd", name = "e", descriptor = "Lclient!abs;")
	final Interface4 anInterface4_26;

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "Lclient!xq;")
	final Class667 aClass667_32;

	@OriginalMember(owner = "client!acd", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_86;

	@OriginalMember(owner = "client!acd", name = "k", descriptor = "I")
	protected int anInt2586;

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "[Lclient!ay;")
	Interface13[] anInterface13Array3;

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!xq;Lclient!py;Lclient!abs;Z)V", line = 21)
	Class55(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(5) boolean arg5) {
		this.anInterface4_26 = arg4;
		this.aClass667_32 = arg2;
		this.aClass497_86 = arg3;
		this.anInt2586 = Class546.method30973(this.aClass497_86, this.aClass667_32) * 1103564513;
		this.anInterface13Array3 = (Interface13[]) Array.newInstance(this.anInterface4_26.method27701(), this.anInt2586 * 1007858977);
		if (arg5) {
			for (@Pc(37) int local37 = 0; local37 < this.anInt2586 * 1007858977; local37++) {
				this.method18269(local37);
			}
		}
	}

	@OriginalMember(owner = "client!acd", name = "e", descriptor = "(II)Lclient!ay;", line = 35)
	@Override
	public Interface13 method18261(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27703(-1, this);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18269(arg0);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "m", descriptor = "(I)Lclient!ay;", line = 35)
	@Override
	public Interface13 method18264(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27703(-1, this);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18269(arg0);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "k", descriptor = "(I)Lclient!ay;", line = 35)
	@Override
	public Interface13 method18265(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27703(-1, this);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18269(arg0);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "r", descriptor = "(I)V", line = 44)
	void method18268(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27703(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(31) byte[] local31 = Class650.method32669(this.aClass497_86, this.aClass667_32, arg0);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36654(new Class93_Sub41(local31));
		}
		this.anInterface13Array3[arg0].method36653();
	}

	@OriginalMember(owner = "client!acd", name = "u", descriptor = "(II)V", line = 44)
	void method18269(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27703(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(31) byte[] local31 = Class650.method32669(this.aClass497_86, this.aClass667_32, arg0);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36654(new Class93_Sub41(local31));
		}
		this.anInterface13Array3[arg0].method36653();
	}

	@OriginalMember(owner = "client!acd", name = "z", descriptor = "(I)V", line = 44)
	void method18273(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27703(arg0, this);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(31) byte[] local31 = Class650.method32669(this.aClass497_86, this.aClass667_32, arg0);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36654(new Class93_Sub41(local31));
		}
		this.anInterface13Array3[arg0].method36653();
	}

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "(I)I", line = 59)
	@Override
	public int method18262() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "f", descriptor = "()I", line = 59)
	@Override
	public int method18263() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "()I", line = 59)
	@Override
	public int method18266() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "l", descriptor = "()I", line = 59)
	@Override
	public int method18267() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "p", descriptor = "()Ljava/util/Iterator;", line = 63)
	public Iterator method18270() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "d", descriptor = "()Ljava/util/Iterator;", line = 63)
	public Iterator method18271() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "()Ljava/util/Iterator;", line = 63)
	public Iterator method18272() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 63)
	@Override
	public Iterator iterator() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "x", descriptor = "(I)V", line = 260)
	static void method18274() {
		Class93_Sub6.aClass240_19.method25833();
	}

	@OriginalMember(owner = "client!acd", name = "pe", descriptor = "(Lclient!yf;B)V", line = 7714)
	static final void method18275(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24573(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!acd", name = "qq", descriptor = "(Lclient!yf;I)V", line = 7983)
	static final void method18276(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class389.method28270(local16, local22, arg0);
	}
}
