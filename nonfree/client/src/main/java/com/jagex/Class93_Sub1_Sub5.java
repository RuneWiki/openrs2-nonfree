package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ard")
public class Class93_Sub1_Sub5 extends Class93_Sub1 {

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "I")
	int anInt3000;

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "[B")
	byte[] aByteArray56;

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "I")
	int anInt3002;

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "Lclient!ako;")
	Class93_Sub25 aClass93_Sub25_1;

	@OriginalMember(owner = "client!ard", name = "q", descriptor = "Z")
	boolean aBoolean499;

	@OriginalMember(owner = "client!ard", name = "s", descriptor = "Z")
	boolean aBoolean500;

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "Z")
	boolean aBoolean501;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "[[Lclient!dn;")
	Class230[][] aClass230ArrayArray1 = (Class230[][]) null;

	@OriginalMember(owner = "client!ard", name = "o", descriptor = "I")
	int anInt3003 = 0;

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "I")
	int anInt3001;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21548(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21549(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21550(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21553(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "<init>", descriptor = "(I)V", line = 27)
	public Class93_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3001 = arg0 * 230938741;
	}

	@OriginalMember(owner = "client!ard", name = "n", descriptor = "(I)Z", line = 32)
	public boolean method21555() {
		if (this.aClass230ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray56 == null) {
			@Pc(12) Class497 local12 = Class614.aClass497_134;
			synchronized (Class614.aClass497_134) {
				this.aByteArray56 = Class614.aClass497_134.method30059(this.anInt3001 * 1796814813);
				if (this.aByteArray56 == null) {
					return false;
				}
			}
		}
		@Pc(39) boolean local39 = true;
		@Pc(45) Class93_Sub41 local45 = new Class93_Sub41(this.aByteArray56);
		@Pc(49) int local49 = local45.method22413();
		@Pc(53) int local53 = local45.method22415();
		@Pc(56) Class497 local56 = Class722.aClass497_144;
		synchronized (Class722.aClass497_144) {
			local39 &= Class722.aClass497_144.method30054(local53);
		}
		if (!local39) {
			return false;
		}
		local56 = Class614.aClass497_134;
		synchronized (Class614.aClass497_134) {
			this.aClass93_Sub25_1 = new Class93_Sub25(local53, Class722.aClass497_144.method30059(local53));
			this.method21539(local45, local49);
			this.aByteArray56 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!ard", name = "m", descriptor = "(Lclient!alw;IB)V", line = 56)
	void method21539(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.method22415() * -1452663667;
		this.anInt3000 = arg0.method22415() * 458944011;
		this.anInt3003 = arg0.method22413() * -412893821;
		@Pc(24) int local24 = arg0.method22415();
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.method22413());
			@Pc(47) int local47 = arg0.method22431();
			@Pc(53) Class211 local53 = Class581.method31399(arg0.method22413());
			@Pc(57) Class230 local57 = new Class230();
			local57.method25647(arg0, arg1);
			@Pc(67) int local67 = local43.method25727();
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25422()] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "(Lclient!alw;I)V", line = 56)
	void method21552(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.method22415() * -1452663667;
		this.anInt3000 = arg0.method22415() * 458944011;
		this.anInt3003 = arg0.method22413() * -412893821;
		@Pc(24) int local24 = arg0.method22415();
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.method22413());
			@Pc(47) int local47 = arg0.method22431();
			@Pc(53) Class211 local53 = Class581.method31399(arg0.method22413());
			@Pc(57) Class230 local57 = new Class230();
			local57.method25647(arg0, arg1);
			@Pc(67) int local67 = local43.method25727();
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25422()] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "x", descriptor = "(Lclient!alw;I)V", line = 56)
	void method21564(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.method22415() * -1452663667;
		this.anInt3000 = arg0.method22415() * 458944011;
		this.anInt3003 = arg0.method22413() * -412893821;
		@Pc(24) int local24 = arg0.method22415();
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.method22413());
			@Pc(47) int local47 = arg0.method22431();
			@Pc(53) Class211 local53 = Class581.method31399(arg0.method22413());
			@Pc(57) Class230 local57 = new Class230();
			local57.method25647(arg0, arg1);
			@Pc(67) int local67 = local43.method25727();
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25422()] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "k", descriptor = "(S)I", line = 85)
	public int method21542() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "i", descriptor = "()I", line = 85)
	public int method21546() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "h", descriptor = "()I", line = 85)
	public int method21551() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "a", descriptor = "()I", line = 85)
	public int method21554() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "g", descriptor = "()I", line = 85)
	public int method21556() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "f", descriptor = "(B)I", line = 89)
	public int method21543() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "j", descriptor = "()I", line = 89)
	public int method21558() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "ae", descriptor = "()I", line = 89)
	public int method21559() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "w", descriptor = "(I)I", line = 93)
	int method21541() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ag", descriptor = "()I", line = 93)
	int method21545() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ah", descriptor = "()I", line = 93)
	int method21561() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "al", descriptor = "()I", line = 93)
	int method21562() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ac", descriptor = "()I", line = 93)
	int method21563() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "(I)I", line = 97)
	public int method21544() {
		return this.method21543() - this.method21542();
	}

	@OriginalMember(owner = "client!ard", name = "ai", descriptor = "()I", line = 97)
	public int method21560() {
		return this.method21543() - this.method21542();
	}

	@OriginalMember(owner = "client!ard", name = "u", descriptor = "(I)Z", line = 101)
	public boolean method21566() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "(I)Z", line = 105)
	public boolean method21547() {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!ard", name = "aw", descriptor = "()Z", line = 105)
	public boolean method21565() {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!ard", name = "at", descriptor = "()Z", line = 109)
	public boolean method21540() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "as", descriptor = "()Z", line = 109)
	public boolean method21557() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "(I)Z", line = 109)
	public boolean method21567() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "ad", descriptor = "()Z", line = 109)
	public boolean method21568() {
		return this.aBoolean499;
	}
}
