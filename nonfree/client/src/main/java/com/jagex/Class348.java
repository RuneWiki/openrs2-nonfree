package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public class Class348 implements Interface31 {

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!cy;")
	Class83 aClass83_27;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_106;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "Lclient!mi;")
	final Class400 aClass400_1;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!pw;Lclient!mi;)V", line = 15)
	Class348(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class400 arg1) {
		this.aClass478_106 = arg0;
		this.aClass400_1 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "()V", line = 21)
	@Override
	public void method27919() {
		this.aClass83_27 = Class273.method26540(this.aClass478_106, this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "(S)V", line = 21)
	@Override
	public void method27917() {
		this.aClass83_27 = Class273.method26540(this.aClass478_106, this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(ZB)V", line = 25)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class149_Sub4.anInt2368 * 1771907305 > client.anInt3394 * -321474631 ? Class149_Sub4.anInt2368 * 1771907305 : client.anInt3394 * -321474631;
		@Pc(31) int local31 = Class19.anInt108 * -1091172141 > client.anInt3464 * 43072843 ? Class19.anInt108 * -1091172141 : client.anInt3464 * 43072843;
		@Pc(35) int local35 = this.aClass83_27.method18121();
		@Pc(39) int local39 = this.aClass83_27.method18198();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local31 * local35 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass83_27.method18125(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "(Z)V", line = 25)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class149_Sub4.anInt2368 * 1771907305 > client.anInt3394 * -321474631 ? Class149_Sub4.anInt2368 * 1771907305 : client.anInt3394 * -321474631;
		@Pc(31) int local31 = Class19.anInt108 * -1091172141 > client.anInt3464 * 43072843 ? Class19.anInt108 * -1091172141 : client.anInt3464 * 43072843;
		@Pc(35) int local35 = this.aClass83_27.method18121();
		@Pc(39) int local39 = this.aClass83_27.method18198();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local16 * local39 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local31 * local35 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass83_27.method18125(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "()Z", line = 45)
	@Override
	public boolean method27922() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "(I)Z", line = 45)
	@Override
	public boolean method27915() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "()Z", line = 45)
	@Override
	public boolean method27916() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "()Z", line = 45)
	@Override
	public boolean method27920() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "()Z", line = 45)
	@Override
	public boolean method27924() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "()Z", line = 45)
	@Override
	public boolean method27923() {
		return this.aClass478_106.method29730(this.aClass400_1.anInt4683 * 632315143);
	}

	@OriginalMember(owner = "client!jq", name = "hl", descriptor = "(I)V", line = 3662)
	static final void method27861() {
		if (client.aFloat249 < 1083.0F) {
			client.aFloat249 = 1083.0F;
		}
		if (client.aFloat249 > 2987.0F) {
			client.aFloat249 = 2987.0F;
		}
		while (client.aFloat247 >= 16384.0F) {
			client.aFloat247 -= 16384.0F;
		}
		while (client.aFloat247 < 0.0F) {
			client.aFloat247 += 16384.0F;
		}
		@Pc(33) Class474 local33 = client.aClass517_1.method30441();
		@Pc(37) Class556 local37 = client.aClass517_1.method30435();
		@Pc(43) int local43 = Class585.anInt5453 * 1490134939 >> 9;
		@Pc(49) int local49 = Class127.anInt1449 * -1293868227 >> 9;
		@Pc(61) int local61 = Class277.method26658(Class585.anInt5453 * 1490134939, Class127.anInt1449 * -1293868227, Class669.anInt5790 * -878424575);
		@Pc(63) int local63 = 0;
		@Pc(87) int local87;
		if (local43 > 3 && local49 > 3 && local43 < client.aClass517_1.method30411() - 4 && local49 < client.aClass517_1.method30417() - 4) {
			for (local87 = local43 - 4; local87 <= local43 + 4; local87++) {
				for (@Pc(96) int local96 = local49 - 4; local96 <= local49 + 4; local96++) {
					@Pc(105) int local105 = Class669.anInt5790 * -878424575;
					if (local105 < 3 && local33.method29665(local87, local96)) {
						local105++;
					}
					@Pc(117) int local117 = 0;
					@Pc(122) byte[][] local122 = client.aClass517_1.method30438(local105);
					if (local122 != null) {
						local117 = (local122[local87][local96] & 0xFF) * 8 << 2;
					}
					if (local37.aClass88Array1 != null && local37.aClass88Array1[local105] != null) {
						@Pc(159) int local159 = local61 - (local37.aClass88Array1[local105].method5500(local87, local96) - local117);
						if (local159 > local63) {
							local63 = local159;
						}
					}
				}
			}
		}
		local87 = (local63 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > client.anInt3377 * 544044433) {
			client.anInt3377 += (local87 - client.anInt3377 * 544044433) / 24 * 1259596657;
		} else if (local87 < client.anInt3377 * 544044433) {
			client.anInt3377 += (local87 - client.anInt3377 * 544044433) / 80 * 1259596657;
		}
	}
}
