package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abe")
public class Class32 implements Interface11 {

	@OriginalMember(owner = "client!abe", name = "hw", descriptor = "Lclient!aos;")
	public static Class32_Sub17 aClass32_Sub17_23;

	@OriginalMember(owner = "client!abe", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_84;

	@OriginalMember(owner = "client!abe", name = "n", descriptor = "Lclient!xq;")
	final Class667 aClass667_31;

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "Lclient!abs;")
	protected final Interface4 anInterface4_25;

	@OriginalMember(owner = "client!abe", name = "m", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!abe", name = "k", descriptor = "Lclient!eb;")
	Class240 aClass240_62;

	@OriginalMember(owner = "client!abe", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!xq;ILclient!abs;)V", line = 20)
	public Class32(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class667 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface4 arg5) {
		this.aClass497_84 = arg2;
		this.aClass667_31 = arg3;
		this.anInterface4_25 = arg5;
		this.anInt2487 = Class546.method30973(this.aClass497_84, this.aClass667_31) * 418600949;
		this.aClass240_62 = new Class240(arg4);
	}

	@OriginalMember(owner = "client!abe", name = "e", descriptor = "(II)Lclient!ay;", line = 30)
	@Override
	public Interface13 method18261(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25839((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17821(arg0);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25830(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "m", descriptor = "(I)Lclient!ay;", line = 30)
	@Override
	public Interface13 method18264(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25839((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17821(arg0);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25830(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "k", descriptor = "(I)Lclient!ay;", line = 30)
	@Override
	public Interface13 method18265(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25839((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17821(arg0);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25830(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "u", descriptor = "(II)Lclient!ay;", line = 43)
	Interface13 method17821(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32669(this.aClass497_84, this.aClass667_31, arg0);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27703(arg0, this);
		if (local12 != null) {
			local27.method36654(new Class93_Sub41(local12));
		}
		local27.method36653();
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "ae", descriptor = "(I)Lclient!ay;", line = 43)
	Interface13 method17823(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32669(this.aClass497_84, this.aClass667_31, arg0);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27703(arg0, this);
		if (local12 != null) {
			local27.method36654(new Class93_Sub41(local12));
		}
		local27.method36653();
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "ag", descriptor = "(I)Lclient!ay;", line = 43)
	Interface13 method17824(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32669(this.aClass497_84, this.aClass667_31, arg0);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27703(arg0, this);
		if (local12 != null) {
			local27.method36654(new Class93_Sub41(local12));
		}
		local27.method36653();
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "l", descriptor = "()I", line = 53)
	@Override
	public int method18267() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "w", descriptor = "()I", line = 53)
	@Override
	public int method18266() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "n", descriptor = "(I)I", line = 53)
	@Override
	public int method18262() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "()I", line = 53)
	@Override
	public int method18263() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "ah", descriptor = "(I)V", line = 57)
	public void method17805(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
			this.aClass240_62 = new Class240(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "z", descriptor = "(II)V", line = 57)
	public void method17822(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
			this.aClass240_62 = new Class240(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "b", descriptor = "()V", line = 64)
	public void method17806() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "r", descriptor = "(I)V", line = 64)
	public void method17807() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "s", descriptor = "()V", line = 64)
	public void method17810() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "y", descriptor = "()V", line = 64)
	public void method17812() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "q", descriptor = "()V", line = 64)
	public void method17813() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "x", descriptor = "()V", line = 64)
	public void method17814() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "h", descriptor = "()V", line = 64)
	public void method17815() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25833();
		}
	}

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "(IIZI)I", line = 69)
	public static int method17826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class93_Sub6 local6 = Class557.method31065(arg0, arg2);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(13) int local13 = 0; local13 < local6.anIntArray173.length; local13++) {
			if (local6.anIntArray173[local13] >= 0 && ((Class47) Class277.aClass32_Sub12_1.method18261(local6.anIntArray173[local13])).anInt140 * 352108515 == arg1) {
				local1 += Class14.method193(arg0, local13, arg2);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!abe", name = "v", descriptor = "(II)V", line = 70)
	public void method17808(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "g", descriptor = "(I)V", line = 70)
	public void method17817(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "i", descriptor = "(I)V", line = 70)
	public void method17818(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "j", descriptor = "(I)V", line = 70)
	public void method17819(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "a", descriptor = "(I)V", line = 70)
	public void method17825(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "o", descriptor = "(I)V", line = 76)
	public void method17811() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25837();
		}
	}

	@OriginalMember(owner = "client!abe", name = "t", descriptor = "()V", line = 76)
	public void method17820() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25837();
		}
	}

	@OriginalMember(owner = "client!abe", name = "c", descriptor = "()Ljava/util/Iterator;", line = 82)
	public Iterator method17804() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "d", descriptor = "()Ljava/util/Iterator;", line = 82)
	public Iterator method17809() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 82)
	@Override
	public Iterator iterator() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "p", descriptor = "()Ljava/util/Iterator;", line = 82)
	public Iterator method17816() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "t", descriptor = "(II)V", line = 182)
	static void method17827(@OriginalArg(0) int arg0) {
		Class665.anInt5848 = arg0 * 1917335355;
		Class93_Sub23_Sub1.aClass93_Sub23_Sub1Array1 = new Class93_Sub23_Sub1[arg0];
		Class93_Sub23_Sub1.anInt3083 = 0;
	}
}
