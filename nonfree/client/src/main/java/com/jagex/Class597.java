package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yd")
public class Class597 {

	@OriginalMember(owner = "client!yd", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_70 = new Class161(64);

	@OriginalMember(owner = "client!yd", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_71 = new Class161(2);

	@OriginalMember(owner = "client!yd", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_111;

	@OriginalMember(owner = "client!yd", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_110;

	@OriginalMember(owner = "client!yd", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 17)
	public Class597(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_111 = arg2;
		this.aClass359_110 = arg3;
		this.aClass359_111.method26682(Class185.aClass185_39.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!yd", name = "p", descriptor = "(IB)Lclient!yt;", line = 25)
	public Class608 method33466(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		@Pc(11) Class608 local11;
		synchronized (this.aClass161_70) {
			local11 = (Class608) this.aClass161_70.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_111;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_111) {
			local39 = this.aClass359_111.method26713(Class185.aClass185_39.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class608();
		local11.aClass597_2 = this;
		if (local39 != null) {
			local11.method33557(new Class3_Sub41(local39));
		}
		@Pc(67) Class161 local67 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yd", name = "h", descriptor = "(I)Lclient!yt;", line = 25)
	public Class608 method33470(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		@Pc(11) Class608 local11;
		synchronized (this.aClass161_70) {
			local11 = (Class608) this.aClass161_70.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_111;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_111) {
			local39 = this.aClass359_111.method26713(Class185.aClass185_39.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class608();
		local11.aClass597_2 = this;
		if (local39 != null) {
			local11.method33557(new Class3_Sub41(local39));
		}
		@Pc(67) Class161 local67 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yd", name = "x", descriptor = "(I)Lclient!yt;", line = 25)
	public Class608 method33471(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		@Pc(11) Class608 local11;
		synchronized (this.aClass161_70) {
			local11 = (Class608) this.aClass161_70.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_111;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_111) {
			local39 = this.aClass359_111.method26713(Class185.aClass185_39.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class608();
		local11.aClass597_2 = this;
		if (local39 != null) {
			local11.method33557(new Class3_Sub41(local39));
		}
		@Pc(67) Class161 local67 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yd", name = "s", descriptor = "(I)Lclient!yt;", line = 25)
	public Class608 method33473(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		@Pc(11) Class608 local11;
		synchronized (this.aClass161_70) {
			local11 = (Class608) this.aClass161_70.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_111;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_111) {
			local39 = this.aClass359_111.method26713(Class185.aClass185_39.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class608();
		local11.aClass597_2 = this;
		if (local39 != null) {
			local11.method33557(new Class3_Sub41(local39));
		}
		@Pc(67) Class161 local67 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yd", name = "u", descriptor = "()V", line = 43)
	public void method33465() {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23224();
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23224();
		}
	}

	@OriginalMember(owner = "client!yd", name = "a", descriptor = "(I)V", line = 43)
	public void method33475() {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23224();
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23224();
		}
	}

	@OriginalMember(owner = "client!yd", name = "c", descriptor = "(I)V", line = 52)
	public void method33467(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23240(arg0);
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!yd", name = "g", descriptor = "(II)V", line = 52)
	public void method33468(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23240(arg0);
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!yd", name = "y", descriptor = "(I)V", line = 52)
	public void method33472(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23240(arg0);
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!yd", name = "b", descriptor = "(I)V", line = 52)
	public void method33474(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23240(arg0);
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!yd", name = "l", descriptor = "(I)V", line = 61)
	public void method33469() {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23245();
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23245();
		}
	}

	@OriginalMember(owner = "client!yd", name = "z", descriptor = "()V", line = 61)
	public void method33476() {
		@Pc(3) Class161 local3 = this.aClass161_70;
		synchronized (this.aClass161_70) {
			this.aClass161_70.method23245();
		}
		local3 = this.aClass161_71;
		synchronized (this.aClass161_71) {
			this.aClass161_71.method23245();
		}
	}

	@OriginalMember(owner = "client!yd", name = "kr", descriptor = "(I)V", line = 9694)
	static final void method33477() {
		Class69_Sub1.aClass178Array4 = null;
		Class3_Sub1_Sub17.method19458(client.anInt3125 * -1579500007, 0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, 0, 0, -1);
		if (Class69_Sub1.aClass178Array4 != null) {
			Class624.method33782(Class69_Sub1.aClass178Array4, -1412584499, 0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, Class13.anInt2438 * -627910671, Class625.anInt5577 * -574843531, Class424.aClass178_16 == client.aClass178_11 ? -1 : client.aClass178_11.anInt3581 * -1900524041, true);
			Class69_Sub1.aClass178Array4 = null;
		}
	}
}
