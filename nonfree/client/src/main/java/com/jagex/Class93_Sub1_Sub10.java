package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arr")
public class Class93_Sub1_Sub10 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "Lclient!py;")
	static Class497 aClass497_94;

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "Lclient!py;")
	static Class497 aClass497_95;

	@OriginalMember(owner = "client!arr", name = "p", descriptor = "[[B")
	byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "[Lclient!dx;")
	Class236[] aClass236Array1;

	@OriginalMember(owner = "client!arr", name = "z", descriptor = "I")
	int anInt3016;

	@OriginalMember(owner = "client!arr", name = "w", descriptor = "(Lclient!py;Lclient!py;I)V", line = 16)
	public static void method21780(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		aClass497_94 = arg0;
		aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "(Lclient!py;Lclient!py;I)V", line = 16)
	public static void method21781(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		aClass497_94 = arg0;
		aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!arr", name = "<init>", descriptor = "(I)V", line = 20)
	public Class93_Sub1_Sub10(@OriginalArg(0) int arg0) {
		this.anInt3016 = arg0 * -1219731127;
	}

	@OriginalMember(owner = "client!arr", name = "n", descriptor = "(I)Z", line = 25)
	public boolean method21776() {
		if (this.aClass236Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(11) Class497 local11 = aClass497_94;
			synchronized (aClass497_94) {
				if (!aClass497_94.method30092(this.anInt3016 * 2053791993)) {
					return false;
				}
				@Pc(32) int[] local32 = aClass497_94.method30060(this.anInt3016 * 2053791993);
				this.aByteArrayArray13 = new byte[local32.length][];
				for (@Pc(39) int local39 = 0; local39 < local32.length; local39++) {
					this.aByteArrayArray13[local39] = aClass497_94.method30044(this.anInt3016 * 2053791993, local32[local39]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(93) int local93;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray13.length; local71++) {
			@Pc(81) byte[] local81 = this.aByteArrayArray13[local71];
			@Pc(86) Class93_Sub41 local86 = new Class93_Sub41(local81);
			local86.anInt3070 = -1445626955;
			local93 = local86.method22415();
			@Pc(96) Class497 local96 = aClass497_95;
			synchronized (aClass497_95) {
				local69 &= aClass497_95.method30054(local93);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(122) Class22 local122 = new Class22();
		@Pc(125) Class497 local125 = aClass497_94;
		@Pc(146) int[] local146;
		synchronized (aClass497_94) {
			local93 = aClass497_94.method30062(this.anInt3016 * 2053791993);
			this.aClass236Array1 = new Class236[local93];
			local146 = aClass497_94.method30060(this.anInt3016 * 2053791993);
		}
		for (@Pc(156) int local156 = 0; local156 < local146.length; local156++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray13[local156];
			@Pc(170) Class93_Sub41 local170 = new Class93_Sub41(local165);
			local170.anInt3070 = -1445626955;
			@Pc(177) int local177 = local170.method22415();
			@Pc(179) Class93_Sub25 local179 = null;
			for (@Pc(184) Class93_Sub25 local184 = (Class93_Sub25) local122.method445(); local184 != null; local184 = (Class93_Sub25) local122.method415()) {
				if (local184.anInt1589 * -1647955937 == local177) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class497 local208 = aClass497_95;
				synchronized (aClass497_95) {
					local179 = new Class93_Sub25(local177, aClass497_95.method30059(local177));
				}
				local122.method407(local179);
			}
			this.aClass236Array1[local146[local156]] = new Class236(local165, local179);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "()Z", line = 25)
	public boolean method21782() {
		if (this.aClass236Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(11) Class497 local11 = aClass497_94;
			synchronized (aClass497_94) {
				if (!aClass497_94.method30092(this.anInt3016 * 2053791993)) {
					return false;
				}
				@Pc(32) int[] local32 = aClass497_94.method30060(this.anInt3016 * 2053791993);
				this.aByteArrayArray13 = new byte[local32.length][];
				for (@Pc(39) int local39 = 0; local39 < local32.length; local39++) {
					this.aByteArrayArray13[local39] = aClass497_94.method30044(this.anInt3016 * 2053791993, local32[local39]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(93) int local93;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray13.length; local71++) {
			@Pc(81) byte[] local81 = this.aByteArrayArray13[local71];
			@Pc(86) Class93_Sub41 local86 = new Class93_Sub41(local81);
			local86.anInt3070 = -1445626955;
			local93 = local86.method22415();
			@Pc(96) Class497 local96 = aClass497_95;
			synchronized (aClass497_95) {
				local69 &= aClass497_95.method30054(local93);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(122) Class22 local122 = new Class22();
		@Pc(125) Class497 local125 = aClass497_94;
		@Pc(146) int[] local146;
		synchronized (aClass497_94) {
			local93 = aClass497_94.method30062(this.anInt3016 * 2053791993);
			this.aClass236Array1 = new Class236[local93];
			local146 = aClass497_94.method30060(this.anInt3016 * 2053791993);
		}
		for (@Pc(156) int local156 = 0; local156 < local146.length; local156++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray13[local156];
			@Pc(170) Class93_Sub41 local170 = new Class93_Sub41(local165);
			local170.anInt3070 = -1445626955;
			@Pc(177) int local177 = local170.method22415();
			@Pc(179) Class93_Sub25 local179 = null;
			for (@Pc(184) Class93_Sub25 local184 = (Class93_Sub25) local122.method445(); local184 != null; local184 = (Class93_Sub25) local122.method415()) {
				if (local184.anInt1589 * -1647955937 == local177) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class497 local208 = aClass497_95;
				synchronized (aClass497_95) {
					local179 = new Class93_Sub25(local177, aClass497_95.method30059(local177));
				}
				local122.method407(local179);
			}
			this.aClass236Array1[local146[local156]] = new Class236(local165, local179);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "m", descriptor = "(II)Z", line = 77)
	public boolean method21777(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean658;
	}

	@OriginalMember(owner = "client!arr", name = "z", descriptor = "(I)Z", line = 77)
	public boolean method21783(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean658;
	}

	@OriginalMember(owner = "client!arr", name = "p", descriptor = "(I)Z", line = 77)
	public boolean method21787(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean658;
	}

	@OriginalMember(owner = "client!arr", name = "k", descriptor = "(II)Z", line = 81)
	public boolean method21778(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean659;
	}

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "(I)Z", line = 81)
	public boolean method21785(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean659;
	}

	@OriginalMember(owner = "client!arr", name = "f", descriptor = "(II)Z", line = 85)
	public boolean method21775(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean660;
	}

	@OriginalMember(owner = "client!arr", name = "r", descriptor = "(I)Z", line = 85)
	public boolean method21779(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean660;
	}

	@OriginalMember(owner = "client!arr", name = "v", descriptor = "(I)Z", line = 85)
	public boolean method21784(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean660;
	}

	@OriginalMember(owner = "client!arr", name = "c", descriptor = "(I)Z", line = 85)
	public boolean method21786(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean660;
	}
}
