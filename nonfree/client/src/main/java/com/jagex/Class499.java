package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class499 {

	@OriginalMember(owner = "client!ue", name = "hv", descriptor = "Ljava/util/Map;")
	public static Map aMap13;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_57 = new Class161(64);

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_92;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
	public int anInt5232;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 15)
	public Class499(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_92 = arg2;
		this.anInt5232 = this.aClass359_92.method26682(Class185.aClass185_77.anInt3631 * -1739932335) * 1332397189;
	}

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "(II)Lclient!ug;", line = 22)
	public Class501 method29364(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_57;
		@Pc(11) Class501 local11;
		synchronized (this.aClass161_57) {
			local11 = (Class501) this.aClass161_57.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_92;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_92) {
			local38 = this.aClass359_92.method26713(Class185.aClass185_77.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class501();
		local11.anInt5234 = arg0 * 1745912179;
		if (local38 != null) {
			local11.method29444(new Class3_Sub41(local38));
		}
		local11.method29446();
		@Pc(71) Class161 local71 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)Lclient!ug;", line = 22)
	public Class501 method29368(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_57;
		@Pc(11) Class501 local11;
		synchronized (this.aClass161_57) {
			local11 = (Class501) this.aClass161_57.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_92;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_92) {
			local38 = this.aClass359_92.method26713(Class185.aClass185_77.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class501();
		local11.anInt5234 = arg0 * 1745912179;
		if (local38 != null) {
			local11.method29444(new Class3_Sub41(local38));
		}
		local11.method29446();
		@Pc(71) Class161 local71 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "(I)Lclient!ug;", line = 22)
	public Class501 method29369(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_57;
		@Pc(11) Class501 local11;
		synchronized (this.aClass161_57) {
			local11 = (Class501) this.aClass161_57.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_92;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_92) {
			local38 = this.aClass359_92.method26713(Class185.aClass185_77.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class501();
		local11.anInt5234 = arg0 * 1745912179;
		if (local38 != null) {
			local11.method29444(new Class3_Sub41(local38));
		}
		local11.method29446();
		@Pc(71) Class161 local71 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 41)
	public void method29366() {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23224();
		}
	}

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "()V", line = 41)
	public void method29370() {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23224();
		}
	}

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "(I)V", line = 47)
	public void method29371(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(IB)V", line = 47)
	public void method29372(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "()V", line = 53)
	public void method29365() {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23245();
		}
	}

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "(B)V", line = 53)
	public void method29367() {
		@Pc(3) Class161 local3 = this.aClass161_57;
		synchronized (this.aClass161_57) {
			this.aClass161_57.method23245();
		}
	}

	@OriginalMember(owner = "client!ue", name = "ff", descriptor = "(Lclient!vs;I)V", line = 5071)
	static final void method29373(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class402.method27618(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "gy", descriptor = "(Lclient!vs;B)V", line = 5141)
	static final void method29374(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class209.method24239(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "tv", descriptor = "(Lclient!vs;I)V", line = 7649)
	static final void method29375(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(45) short local45 = 256;
		Class510.aClass183_1.method23589(Class160.aClass160_9, local13, local23, local43, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local45, local33);
	}

	@OriginalMember(owner = "client!ue", name = "yj", descriptor = "(Lclient!vs;B)V", line = 8427)
	static final void method29376(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3194 * 963130851 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3174 * 918731051;
		}
	}

	@OriginalMember(owner = "client!ue", name = "ahz", descriptor = "(Lclient!vs;B)V", line = 10331)
	static final void method29377(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		Class414.aShortArray109[arg0.anIntArray496[arg0.anInt5319 * 960738381]] = (short) Class69_Sub2.method14573(arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
		Class44_Sub3.aClass596_1.method33442();
		Class44_Sub3.aClass596_1.method33441();
		Class498.aClass579_1.method33184();
		Class401.method27608();
	}
}
