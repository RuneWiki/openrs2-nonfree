package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public class Class612 {

	@OriginalMember(owner = "client!wa", name = "cd", descriptor = "Lclient!zm;")
	static Class695 aClass695_52;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
	int anInt5574;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
	int anInt5575;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	int anInt5576;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	int anInt5577;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
	int anInt5578;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	int anInt5579;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	int anInt5581;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
	int anInt5582;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	int anInt5580 = 0;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
	boolean aBoolean833 = false;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!wh;")
	Class618 aClass618_1 = new Class618();

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!wh;")
	Class618 aClass618_2 = new Class618();

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Z")
	boolean aBoolean835 = false;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
	boolean aBoolean834 = false;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!dk;")
	final Class205 aClass205_2;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "Lclient!wp;")
	final Class626 aClass626_8;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "J")
	long aLong297;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!me;")
	Class396 aClass396_1;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "Lclient!zv;")
	Class703 aClass703_9;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "(I)Z", line = 26)
	public static boolean method32234() {
		return Class515.anInterface59_1 != null;
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!dx;Lclient!dk;Lclient!wp;J)V", line = 31)
	Class612(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class626 arg2, @OriginalArg(3) long arg3) {
		this.aClass205_2 = arg1;
		this.aClass626_8 = arg2;
		this.aLong297 = arg3 * 1061249100544633607L;
		this.aClass396_1 = this.aClass205_2.method25555(arg0.anInterface47_6);
		if (!arg0.method20056() && this.aClass396_1.anInt4653 * -545982847 != -1) {
			this.aClass396_1 = arg0.anInterface47_6.method28528(this.aClass396_1.anInt4653 * -545982847);
		}
		this.aClass703_9 = new Class703();
		this.anInt5580 = (int) ((double) (this.anInt5580 * 780007339) + Math.random() * 64.0D) * 65358595;
		this.method32235();
		this.aClass618_2.anInt5596 = this.aClass618_1.anInt5596;
		this.aClass618_2.anInt5597 = this.aClass618_1.anInt5597;
		this.aClass618_2.anInt5601 = this.aClass618_1.anInt5601;
		this.aClass618_2.anInt5599 = this.aClass618_1.anInt5599;
		this.aClass618_2.anInt5600 = this.aClass618_1.anInt5600;
		this.aClass618_2.anInt5598 = this.aClass618_1.anInt5598;
		this.aClass618_2.anInt5602 = this.aClass618_1.anInt5602;
		this.aClass618_2.anInt5606 = this.aClass618_1.anInt5606;
		this.aClass618_2.anInt5604 = this.aClass618_1.anInt5604;
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(I)V", line = 52)
	void method32235() {
		this.aClass618_1.anInt5596 = this.aClass205_2.anInt3573 * 720651617;
		this.aClass618_1.anInt5597 = this.aClass205_2.anInt3580 * -1609415377;
		this.aClass618_1.anInt5601 = this.aClass205_2.anInt3574 * 1967664537;
		this.aClass618_1.anInt5599 = this.aClass205_2.anInt3575 * 644414993;
		this.aClass618_1.anInt5600 = this.aClass205_2.anInt3567 * -649875913;
		this.aClass618_1.anInt5598 = this.aClass205_2.anInt3576 * 1986510425;
		this.aClass618_1.anInt5602 = this.aClass205_2.anInt3578 * -1134895951;
		this.aClass618_1.anInt5606 = this.aClass205_2.anInt3579 * -1110900119;
		this.aClass618_1.anInt5604 = this.aClass205_2.anInt3577 * 1399265027;
		if (this.aClass618_1.anInt5596 * -1650142075 == this.aClass618_1.anInt5599 * -948931075 && this.aClass618_1.anInt5599 * -948931075 == this.aClass618_1.anInt5602 * 2014210293 && this.aClass618_1.anInt5600 * -2117433821 == this.aClass618_1.anInt5597 * 1507124323 && this.aClass618_1.anInt5606 * -1688810245 == this.aClass618_1.anInt5600 * -2117433821 && this.aClass618_1.anInt5601 * 893372357 == this.aClass618_1.anInt5598 * -738400327 && this.aClass618_1.anInt5604 * -820452715 == this.aClass618_1.anInt5598 * -738400327) {
			this.aBoolean835 = true;
		} else if (this.aBoolean835) {
			this.aBoolean835 = false;
			this.aClass618_2.anInt5596 = this.aClass618_1.anInt5596;
			this.aClass618_2.anInt5597 = this.aClass618_1.anInt5597;
			this.aClass618_2.anInt5601 = this.aClass618_1.anInt5601;
			this.aClass618_2.anInt5599 = this.aClass618_1.anInt5599;
			this.aClass618_2.anInt5600 = this.aClass618_1.anInt5600;
			this.aClass618_2.anInt5598 = this.aClass618_1.anInt5598;
			this.aClass618_2.anInt5602 = this.aClass618_1.anInt5602;
			this.aClass618_2.anInt5606 = this.aClass618_1.anInt5606;
			this.aClass618_2.anInt5604 = this.aClass618_1.anInt5604;
		}
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "()V", line = 52)
	void method32236() {
		this.aClass618_1.anInt5596 = this.aClass205_2.anInt3573 * 720651617;
		this.aClass618_1.anInt5597 = this.aClass205_2.anInt3580 * -1609415377;
		this.aClass618_1.anInt5601 = this.aClass205_2.anInt3574 * 1967664537;
		this.aClass618_1.anInt5599 = this.aClass205_2.anInt3575 * 644414993;
		this.aClass618_1.anInt5600 = this.aClass205_2.anInt3567 * -649875913;
		this.aClass618_1.anInt5598 = this.aClass205_2.anInt3576 * 1986510425;
		this.aClass618_1.anInt5602 = this.aClass205_2.anInt3578 * -1134895951;
		this.aClass618_1.anInt5606 = this.aClass205_2.anInt3579 * -1110900119;
		this.aClass618_1.anInt5604 = this.aClass205_2.anInt3577 * 1399265027;
		if (this.aClass618_1.anInt5596 * -1650142075 == this.aClass618_1.anInt5599 * -948931075 && this.aClass618_1.anInt5599 * -948931075 == this.aClass618_1.anInt5602 * 2014210293 && this.aClass618_1.anInt5600 * -2117433821 == this.aClass618_1.anInt5597 * 1507124323 && this.aClass618_1.anInt5606 * -1688810245 == this.aClass618_1.anInt5600 * -2117433821 && this.aClass618_1.anInt5601 * 893372357 == this.aClass618_1.anInt5598 * -738400327 && this.aClass618_1.anInt5604 * -820452715 == this.aClass618_1.anInt5598 * -738400327) {
			this.aBoolean835 = true;
		} else if (this.aBoolean835) {
			this.aBoolean835 = false;
			this.aClass618_2.anInt5596 = this.aClass618_1.anInt5596;
			this.aClass618_2.anInt5597 = this.aClass618_1.anInt5597;
			this.aClass618_2.anInt5601 = this.aClass618_1.anInt5601;
			this.aClass618_2.anInt5599 = this.aClass618_1.anInt5599;
			this.aClass618_2.anInt5600 = this.aClass618_1.anInt5600;
			this.aClass618_2.anInt5598 = this.aClass618_1.anInt5598;
			this.aClass618_2.anInt5602 = this.aClass618_1.anInt5602;
			this.aClass618_2.anInt5606 = this.aClass618_1.anInt5606;
			this.aClass618_2.anInt5604 = this.aClass618_1.anInt5604;
		}
	}

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "()V", line = 52)
	void method32237() {
		this.aClass618_1.anInt5596 = this.aClass205_2.anInt3573 * 720651617;
		this.aClass618_1.anInt5597 = this.aClass205_2.anInt3580 * -1609415377;
		this.aClass618_1.anInt5601 = this.aClass205_2.anInt3574 * 1967664537;
		this.aClass618_1.anInt5599 = this.aClass205_2.anInt3575 * 644414993;
		this.aClass618_1.anInt5600 = this.aClass205_2.anInt3567 * -649875913;
		this.aClass618_1.anInt5598 = this.aClass205_2.anInt3576 * 1986510425;
		this.aClass618_1.anInt5602 = this.aClass205_2.anInt3578 * -1134895951;
		this.aClass618_1.anInt5606 = this.aClass205_2.anInt3579 * -1110900119;
		this.aClass618_1.anInt5604 = this.aClass205_2.anInt3577 * 1399265027;
		if (this.aClass618_1.anInt5596 * -1650142075 == this.aClass618_1.anInt5599 * -948931075 && this.aClass618_1.anInt5599 * -948931075 == this.aClass618_1.anInt5602 * 2014210293 && this.aClass618_1.anInt5600 * -2117433821 == this.aClass618_1.anInt5597 * 1507124323 && this.aClass618_1.anInt5606 * -1688810245 == this.aClass618_1.anInt5600 * -2117433821 && this.aClass618_1.anInt5601 * 893372357 == this.aClass618_1.anInt5598 * -738400327 && this.aClass618_1.anInt5604 * -820452715 == this.aClass618_1.anInt5598 * -738400327) {
			this.aBoolean835 = true;
		} else if (this.aBoolean835) {
			this.aBoolean835 = false;
			this.aClass618_2.anInt5596 = this.aClass618_1.anInt5596;
			this.aClass618_2.anInt5597 = this.aClass618_1.anInt5597;
			this.aClass618_2.anInt5601 = this.aClass618_1.anInt5601;
			this.aClass618_2.anInt5599 = this.aClass618_1.anInt5599;
			this.aClass618_2.anInt5600 = this.aClass618_1.anInt5600;
			this.aClass618_2.anInt5598 = this.aClass618_1.anInt5598;
			this.aClass618_2.anInt5602 = this.aClass618_1.anInt5602;
			this.aClass618_2.anInt5606 = this.aClass618_1.anInt5606;
			this.aClass618_2.anInt5604 = this.aClass618_1.anInt5604;
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lclient!dx;JIZI)V", line = 79)
	void method32238(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean833) {
			arg3 = false;
		} else if (Class622.anInt5637 * -1429983313 < this.aClass396_1.anInt4677 * -1051395639) {
			arg3 = false;
		} else if (Class622.anInt5634 * -1132039491 > Class214.anIntArray350[Class622.anInt5637 * -1429983313]) {
			arg3 = false;
		} else if (this.aBoolean835) {
			arg3 = false;
		} else if (this.aClass396_1.anInt4642 * 920535697 != -1) {
			local50 = (int) (arg1 - this.aLong297 * 5061989693938274999L);
			if (this.aClass396_1.aBoolean734 || local50 <= this.aClass396_1.anInt4642 * 920535697) {
				local50 %= this.aClass396_1.anInt4642 * 920535697;
			} else {
				arg3 = false;
			}
			if (!this.aClass396_1.aBoolean737 && local50 < this.aClass396_1.anInt4651 * -73618117) {
				arg3 = false;
			}
			if (this.aClass396_1.aBoolean737 && local50 >= this.aClass396_1.anInt4651 * -73618117) {
				arg3 = false;
			}
		}
		this.anInt5582 = 0;
		for (@Pc(107) Class131_Sub2_Sub1_Sub1 local107 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local107 != null; local107 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local107.method23076(arg1, arg2);
			this.anInt5582 += -969308481;
		}
		if (arg3) {
			local50 = (this.aClass618_1.anInt5602 * 2014210293 + this.aClass618_1.anInt5599 * -948931075 + this.aClass618_1.anInt5596 * -1650142075) / 3;
			@Pc(169) int local169 = (this.aClass618_1.anInt5600 * -2117433821 + this.aClass618_1.anInt5597 * 1507124323 + this.aClass618_1.anInt5606 * -1688810245) / 3;
			@Pc(189) int local189 = (this.aClass618_1.anInt5598 * -738400327 + this.aClass618_1.anInt5601 * 893372357 + this.aClass618_1.anInt5604 * -820452715) / 3;
			@Pc(243) int local243;
			@Pc(255) int local255;
			@Pc(267) int local267;
			@Pc(279) int local279;
			@Pc(291) int local291;
			@Pc(303) int local303;
			@Pc(436) int local436;
			@Pc(493) int local493;
			@Pc(524) int local524;
			if (local50 != this.aClass618_1.anInt5605 * -1481682457 || this.aClass618_1.anInt5607 * 379767745 != local169 || this.aClass618_1.anInt5603 * 702655677 != local189 || !this.aBoolean834) {
				this.aClass618_1.anInt5605 = local50 * -240963113;
				this.aClass618_1.anInt5607 = local169 * -1857338303;
				this.aClass618_1.anInt5603 = local189 * 873901717;
				local243 = this.aClass618_1.anInt5599 * -948931075 - this.aClass618_1.anInt5596 * -1650142075;
				local255 = this.aClass618_1.anInt5600 * -2117433821 - this.aClass618_1.anInt5597 * 1507124323;
				local267 = this.aClass618_1.anInt5598 * -738400327 - this.aClass618_1.anInt5601 * 893372357;
				local279 = this.aClass618_1.anInt5602 * 2014210293 - this.aClass618_1.anInt5596 * -1650142075;
				local291 = this.aClass618_1.anInt5606 * -1688810245 - this.aClass618_1.anInt5597 * 1507124323;
				local303 = this.aClass618_1.anInt5604 * -820452715 - this.aClass618_1.anInt5601 * 893372357;
				this.anInt5575 = (local255 * local303 - local267 * local291) * 474332711;
				this.anInt5578 = (local279 * local267 - local303 * local243) * -1327782413;
				this.anInt5579 = (local291 * local243 - local279 * local255) * -2021483899;
				while (true) {
					if (this.anInt5575 * -87436905 <= 32767 && this.anInt5578 * -385385669 <= 32767 && this.anInt5579 * 621235789 <= 32767 && this.anInt5575 * -87436905 >= -32767 && this.anInt5578 * -385385669 >= -32767 && this.anInt5579 * 621235789 >= -32767) {
						local436 = (int) Math.sqrt((double) (this.anInt5575 * -87436905 * -87436905 * this.anInt5575 + this.anInt5578 * -385385669 * -385385669 * this.anInt5578 + this.anInt5579 * 621235789 * this.anInt5579 * 621235789));
						if (local436 <= 0) {
							local436 = 1;
						}
						this.anInt5575 = this.anInt5575 * -301879703 / local436 * 474332711;
						this.anInt5578 = -728365883 * this.anInt5578 / local436 * -1327782413;
						this.anInt5579 = this.anInt5579 * -2111884877 / local436 * -2021483899;
						if (this.aClass396_1.aShort176 > 0 || this.aClass396_1.aShort175 > 0) {
							local493 = (int) (Math.atan2((double) (this.anInt5579 * 621235789), (double) (this.anInt5575 * -87436905)) * 2607.5945876176133D);
							local524 = (int) (Math.atan2((double) (this.anInt5578 * -385385669), Math.sqrt((double) (this.anInt5575 * -87436905 * -87436905 * this.anInt5575 + this.anInt5579 * 621235789 * 621235789 * this.anInt5579))) * 2607.5945876176133D);
							this.anInt5576 = (this.aClass396_1.aShort176 - this.aClass396_1.aShort173) * -358712291;
							this.anInt5574 = (local493 + this.aClass396_1.aShort173 - (this.anInt5576 * -560716235 >> 1)) * 1171033591;
							this.anInt5581 = (this.aClass396_1.aShort175 - this.aClass396_1.aShort174) * 446083641;
							this.anInt5577 = (this.aClass396_1.aShort174 + local524 - (this.anInt5581 * 1491180553 >> 1)) * 613595345;
						}
						this.aBoolean834 = true;
						break;
					}
					this.anInt5575 = (this.anInt5575 * -87436905 >> 1) * 474332711;
					this.anInt5578 = (this.anInt5578 * -385385669 >> 1) * -1327782413;
					this.anInt5579 = (this.anInt5579 * 621235789 >> 1) * -2021483899;
				}
			}
			this.anInt5580 += (int) ((double) arg2 * ((double) (this.aClass396_1.anInt4643 * -318956953) + Math.random() * (double) (this.aClass396_1.anInt4661 * -1781600381 - this.aClass396_1.anInt4643 * -318956953))) * 65358595;
			if (this.anInt5580 * 780007339 > 63) {
				local243 = this.anInt5580 * 780007339 >> 6;
				this.anInt5580 = (this.anInt5580 * 780007339 & 0x3F) * 65358595;
				local255 = (arg2 << 8) / local243;
				local303 = 0;
				local436 = 0;
				while (local436 < local243) {
					@Pc(697) int local697;
					@Pc(705) int local705;
					@Pc(709) int local709;
					if (this.aClass396_1.aShort176 <= 0 && this.aClass396_1.aShort175 <= 0) {
						local267 = this.anInt5575 * -87436905;
						local279 = this.anInt5578 * -385385669;
						local291 = this.anInt5579 * 621235789;
					} else {
						local493 = this.anInt5574 * 341459911 + (int) ((double) (this.anInt5576 * -560716235) * Math.random());
						local493 &= 0x3FFF;
						local524 = Class436.anIntArray464[local493];
						@Pc(683) int local683 = Class436.anIntArray463[local493];
						local697 = this.anInt5577 * -1612144591 + (int) ((double) (this.anInt5581 * 1491180553) * Math.random());
						@Pc(701) int local701 = local697 & 0x1FFF;
						local705 = Class436.anIntArray464[local701];
						local709 = Class436.anIntArray463[local701];
						@Pc(711) byte local711 = 13;
						local267 = local705 * local683 >> local711;
						local279 = (local709 << 1) * -1;
						local291 = local524 * local705 >> local711;
					}
					@Pc(748) float local748 = (float) Math.random();
					@Pc(751) float local751 = (float) Math.random();
					if (local751 + local748 > 1.0F) {
						local748 = 1.0F - local748;
						local751 = 1.0F - local751;
					}
					@Pc(771) float local771 = 1.0F - (local751 + local748);
					local697 = (int) ((float) (this.aClass618_1.anInt5602 * 2014210293) * local771 + (float) (this.aClass618_1.anInt5599 * -948931075) * local751 + local748 * (float) (this.aClass618_1.anInt5596 * -1650142075));
					local705 = (int) ((float) (this.aClass618_1.anInt5597 * 1507124323) * local748 + local751 * (float) (this.aClass618_1.anInt5600 * -2117433821) + (float) (this.aClass618_1.anInt5606 * -1688810245) * local771);
					local709 = (int) (local748 * (float) (this.aClass618_1.anInt5601 * 893372357) + (float) (this.aClass618_1.anInt5598 * -738400327) * local751 + local771 * (float) (this.aClass618_1.anInt5604 * -820452715));
					@Pc(877) int local877 = this.aClass396_1.anInt4625 * 579777191 + (int) (Math.random() * (double) (this.aClass396_1.anInt4650 * 770148019 - this.aClass396_1.anInt4625 * 579777191));
					@Pc(899) int local899 = this.aClass396_1.anInt4678 * -1714996053 + (int) (Math.random() * (double) (this.aClass396_1.anInt4671 * 1843131803 - this.aClass396_1.anInt4678 * -1714996053));
					@Pc(921) int local921 = this.aClass396_1.anInt4632 * 1362111377 + (int) (Math.random() * (double) (this.aClass396_1.anInt4633 * -1082478985 - this.aClass396_1.anInt4632 * 1362111377));
					@Pc(927) int local927 = this.aClass396_1.anInt4627 * -200780283;
					if (this.aClass396_1.anInt4680 * -1520113663 != 0) {
						if (this.aClass396_1.anInt4656 * 908744515 == 0) {
							local927 += (int) (Math.random() * (double) (this.aClass396_1.anInt4680 * -1520113663 + 1));
						} else {
							local927 += (int) (Math.random() * (double) (this.aClass396_1.anInt4656 * 908744515 + 1)) * (this.aClass396_1.anInt4680 * -1520113663 / (this.aClass396_1.anInt4656 * 908744515));
						}
					}
					@Pc(987) int local987 = this.aClass396_1.anInt4664 * 1082557415;
					if (this.aClass396_1.anInt4681 * -831517883 != 0) {
						local987 += (int) (Math.random() * (double) (this.aClass396_1.anInt4681 * -831517883 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass396_1.aBoolean736) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass396_1.anInt4660 * -1590427409) + local1013 * (double) (this.aClass396_1.anInt4662 * -467462389)) << 16 | (int) ((double) (this.aClass396_1.anInt4667 * 1164973449) + local1013 * (double) (this.aClass396_1.anInt4665 * 2123356127)) << 8 | (int) ((double) (this.aClass396_1.anInt4663 * -1708133081) * local1013 + (double) (this.aClass396_1.anInt4626 * 1719532367)) | (int) ((double) (this.aClass396_1.anInt4669 * 915869921) + Math.random() * (double) (this.aClass396_1.anInt4668 * 1298659105)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass396_1.anInt4660 * -1590427409) + Math.random() * (double) (this.aClass396_1.anInt4662 * -467462389)) << 16 | (int) ((double) (this.aClass396_1.anInt4667 * 1164973449) + Math.random() * (double) (this.aClass396_1.anInt4665 * 2123356127)) << 8 | (int) ((double) (this.aClass396_1.anInt4626 * 1719532367) + Math.random() * (double) (this.aClass396_1.anInt4663 * -1708133081)) | (int) ((double) (this.aClass396_1.anInt4669 * 915869921) + Math.random() * (double) (this.aClass396_1.anInt4668 * 1298659105)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass396_1.anInt4640 * 1995753329;
					if (!arg0.method20056() && !this.aClass396_1.aBoolean742) {
						local1168 = -1;
					}
					@Pc(1190) Class131_Sub2_Sub1_Sub1 local1190;
					if (Class622.anInt5631 * -1398895791 == Class622.anInt5633 * -676793059) {
						local1190 = new Class131_Sub2_Sub1_Sub1(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass396_1.aBoolean738, this.aClass396_1.aBoolean735);
					} else {
						local1190 = Class622.aClass131_Sub2_Sub1_Sub1Array1[Class622.anInt5631 * -1398895791];
						Class622.anInt5631 = (Class622.anInt5631 * -1398895791 + 1 & 0x3FF) * -1113481807;
						local1190.method23073(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass396_1.aBoolean738, this.aClass396_1.aBoolean735);
					}
					if (local303 > 256) {
						local1190.method23076(arg1, local303 >> 8);
					}
					this.anInt5582 += -969308481;
					local436++;
					local303 += local255;
				}
			}
		}
		if (!this.aClass618_1.method32384(this.aClass618_2)) {
			@Pc(1278) Class618 local1278 = this.aClass618_2;
			this.aClass618_2 = this.aClass618_1;
			this.aClass618_1 = local1278;
			this.aClass618_1.anInt5596 = this.aClass205_2.anInt3573 * 720651617;
			this.aClass618_1.anInt5597 = this.aClass205_2.anInt3580 * -1609415377;
			this.aClass618_1.anInt5601 = this.aClass205_2.anInt3574 * 1967664537;
			this.aClass618_1.anInt5599 = this.aClass205_2.anInt3575 * 644414993;
			this.aClass618_1.anInt5600 = this.aClass205_2.anInt3567 * -649875913;
			this.aClass618_1.anInt5598 = this.aClass205_2.anInt3576 * 1986510425;
			this.aClass618_1.anInt5602 = this.aClass205_2.anInt3578 * -1134895951;
			this.aClass618_1.anInt5606 = this.aClass205_2.anInt3579 * -1110900119;
			this.aClass618_1.anInt5604 = this.aClass205_2.anInt3577 * 1399265027;
			this.aClass618_1.anInt5605 = this.aClass618_2.anInt5605;
			this.aClass618_1.anInt5607 = this.aClass618_2.anInt5607;
			this.aClass618_1.anInt5603 = this.aClass618_2.anInt5603;
		}
		Class622.anInt5636 += this.anInt5582 * -1634087595;
	}

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "(Lclient!dx;JIZ)V", line = 79)
	void method32239(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean833) {
			arg3 = false;
		} else if (Class622.anInt5637 * -1429983313 < this.aClass396_1.anInt4677 * -1051395639) {
			arg3 = false;
		} else if (Class622.anInt5634 * -1132039491 > Class214.anIntArray350[Class622.anInt5637 * -1429983313]) {
			arg3 = false;
		} else if (this.aBoolean835) {
			arg3 = false;
		} else if (this.aClass396_1.anInt4642 * 920535697 != -1) {
			local50 = (int) (arg1 - this.aLong297 * 5061989693938274999L);
			if (this.aClass396_1.aBoolean734 || local50 <= this.aClass396_1.anInt4642 * 920535697) {
				local50 %= this.aClass396_1.anInt4642 * 920535697;
			} else {
				arg3 = false;
			}
			if (!this.aClass396_1.aBoolean737 && local50 < this.aClass396_1.anInt4651 * -73618117) {
				arg3 = false;
			}
			if (this.aClass396_1.aBoolean737 && local50 >= this.aClass396_1.anInt4651 * -73618117) {
				arg3 = false;
			}
		}
		this.anInt5582 = 0;
		for (@Pc(107) Class131_Sub2_Sub1_Sub1 local107 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local107 != null; local107 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local107.method23076(arg1, arg2);
			this.anInt5582 += -969308481;
		}
		if (arg3) {
			local50 = (this.aClass618_1.anInt5602 * 2014210293 + this.aClass618_1.anInt5599 * -948931075 + this.aClass618_1.anInt5596 * -1650142075) / 3;
			@Pc(169) int local169 = (this.aClass618_1.anInt5600 * -2117433821 + this.aClass618_1.anInt5597 * 1507124323 + this.aClass618_1.anInt5606 * -1688810245) / 3;
			@Pc(189) int local189 = (this.aClass618_1.anInt5598 * -738400327 + this.aClass618_1.anInt5601 * 893372357 + this.aClass618_1.anInt5604 * -820452715) / 3;
			@Pc(243) int local243;
			@Pc(255) int local255;
			@Pc(267) int local267;
			@Pc(279) int local279;
			@Pc(291) int local291;
			@Pc(303) int local303;
			@Pc(436) int local436;
			@Pc(493) int local493;
			@Pc(524) int local524;
			if (local50 != this.aClass618_1.anInt5605 * -1481682457 || this.aClass618_1.anInt5607 * 379767745 != local169 || this.aClass618_1.anInt5603 * 702655677 != local189 || !this.aBoolean834) {
				this.aClass618_1.anInt5605 = local50 * -240963113;
				this.aClass618_1.anInt5607 = local169 * -1857338303;
				this.aClass618_1.anInt5603 = local189 * 873901717;
				local243 = this.aClass618_1.anInt5599 * -948931075 - this.aClass618_1.anInt5596 * -1650142075;
				local255 = this.aClass618_1.anInt5600 * -2117433821 - this.aClass618_1.anInt5597 * 1507124323;
				local267 = this.aClass618_1.anInt5598 * -738400327 - this.aClass618_1.anInt5601 * 893372357;
				local279 = this.aClass618_1.anInt5602 * 2014210293 - this.aClass618_1.anInt5596 * -1650142075;
				local291 = this.aClass618_1.anInt5606 * -1688810245 - this.aClass618_1.anInt5597 * 1507124323;
				local303 = this.aClass618_1.anInt5604 * -820452715 - this.aClass618_1.anInt5601 * 893372357;
				this.anInt5575 = (local255 * local303 - local267 * local291) * 474332711;
				this.anInt5578 = (local279 * local267 - local303 * local243) * -1327782413;
				this.anInt5579 = (local291 * local243 - local279 * local255) * -2021483899;
				while (true) {
					if (this.anInt5575 * -87436905 <= 32767 && this.anInt5578 * -385385669 <= 32767 && this.anInt5579 * 621235789 <= 32767 && this.anInt5575 * -87436905 >= -32767 && this.anInt5578 * -385385669 >= -32767 && this.anInt5579 * 621235789 >= -32767) {
						local436 = (int) Math.sqrt((double) (this.anInt5575 * -87436905 * -87436905 * this.anInt5575 + this.anInt5578 * -385385669 * -385385669 * this.anInt5578 + this.anInt5579 * 621235789 * this.anInt5579 * 621235789));
						if (local436 <= 0) {
							local436 = 1;
						}
						this.anInt5575 = this.anInt5575 * -301879703 / local436 * 474332711;
						this.anInt5578 = -728365883 * this.anInt5578 / local436 * -1327782413;
						this.anInt5579 = this.anInt5579 * -2111884877 / local436 * -2021483899;
						if (this.aClass396_1.aShort176 > 0 || this.aClass396_1.aShort175 > 0) {
							local493 = (int) (Math.atan2((double) (this.anInt5579 * 621235789), (double) (this.anInt5575 * -87436905)) * 2607.5945876176133D);
							local524 = (int) (Math.atan2((double) (this.anInt5578 * -385385669), Math.sqrt((double) (this.anInt5575 * -87436905 * -87436905 * this.anInt5575 + this.anInt5579 * 621235789 * 621235789 * this.anInt5579))) * 2607.5945876176133D);
							this.anInt5576 = (this.aClass396_1.aShort176 - this.aClass396_1.aShort173) * -358712291;
							this.anInt5574 = (local493 + this.aClass396_1.aShort173 - (this.anInt5576 * -560716235 >> 1)) * 1171033591;
							this.anInt5581 = (this.aClass396_1.aShort175 - this.aClass396_1.aShort174) * 446083641;
							this.anInt5577 = (this.aClass396_1.aShort174 + local524 - (this.anInt5581 * 1491180553 >> 1)) * 613595345;
						}
						this.aBoolean834 = true;
						break;
					}
					this.anInt5575 = (this.anInt5575 * -87436905 >> 1) * 474332711;
					this.anInt5578 = (this.anInt5578 * -385385669 >> 1) * -1327782413;
					this.anInt5579 = (this.anInt5579 * 621235789 >> 1) * -2021483899;
				}
			}
			this.anInt5580 += (int) ((double) arg2 * ((double) (this.aClass396_1.anInt4643 * -318956953) + Math.random() * (double) (this.aClass396_1.anInt4661 * -1781600381 - this.aClass396_1.anInt4643 * -318956953))) * 65358595;
			if (this.anInt5580 * 780007339 > 63) {
				local243 = this.anInt5580 * 780007339 >> 6;
				this.anInt5580 = (this.anInt5580 * 780007339 & 0x3F) * 65358595;
				local255 = (arg2 << 8) / local243;
				local303 = 0;
				local436 = 0;
				while (local436 < local243) {
					@Pc(697) int local697;
					@Pc(705) int local705;
					@Pc(709) int local709;
					if (this.aClass396_1.aShort176 <= 0 && this.aClass396_1.aShort175 <= 0) {
						local267 = this.anInt5575 * -87436905;
						local279 = this.anInt5578 * -385385669;
						local291 = this.anInt5579 * 621235789;
					} else {
						local493 = this.anInt5574 * 341459911 + (int) ((double) (this.anInt5576 * -560716235) * Math.random());
						local493 &= 0x3FFF;
						local524 = Class436.anIntArray464[local493];
						@Pc(683) int local683 = Class436.anIntArray463[local493];
						local697 = this.anInt5577 * -1612144591 + (int) ((double) (this.anInt5581 * 1491180553) * Math.random());
						@Pc(701) int local701 = local697 & 0x1FFF;
						local705 = Class436.anIntArray464[local701];
						local709 = Class436.anIntArray463[local701];
						@Pc(711) byte local711 = 13;
						local267 = local705 * local683 >> local711;
						local279 = (local709 << 1) * -1;
						local291 = local524 * local705 >> local711;
					}
					@Pc(748) float local748 = (float) Math.random();
					@Pc(751) float local751 = (float) Math.random();
					if (local751 + local748 > 1.0F) {
						local748 = 1.0F - local748;
						local751 = 1.0F - local751;
					}
					@Pc(771) float local771 = 1.0F - (local751 + local748);
					local697 = (int) ((float) (this.aClass618_1.anInt5602 * 2014210293) * local771 + (float) (this.aClass618_1.anInt5599 * -948931075) * local751 + local748 * (float) (this.aClass618_1.anInt5596 * -1650142075));
					local705 = (int) ((float) (this.aClass618_1.anInt5597 * 1507124323) * local748 + local751 * (float) (this.aClass618_1.anInt5600 * -2117433821) + (float) (this.aClass618_1.anInt5606 * -1688810245) * local771);
					local709 = (int) (local748 * (float) (this.aClass618_1.anInt5601 * 893372357) + (float) (this.aClass618_1.anInt5598 * -738400327) * local751 + local771 * (float) (this.aClass618_1.anInt5604 * -820452715));
					@Pc(877) int local877 = this.aClass396_1.anInt4625 * 579777191 + (int) (Math.random() * (double) (this.aClass396_1.anInt4650 * 770148019 - this.aClass396_1.anInt4625 * 579777191));
					@Pc(899) int local899 = this.aClass396_1.anInt4678 * -1714996053 + (int) (Math.random() * (double) (this.aClass396_1.anInt4671 * 1843131803 - this.aClass396_1.anInt4678 * -1714996053));
					@Pc(921) int local921 = this.aClass396_1.anInt4632 * 1362111377 + (int) (Math.random() * (double) (this.aClass396_1.anInt4633 * -1082478985 - this.aClass396_1.anInt4632 * 1362111377));
					@Pc(927) int local927 = this.aClass396_1.anInt4627 * -200780283;
					if (this.aClass396_1.anInt4680 * -1520113663 != 0) {
						if (this.aClass396_1.anInt4656 * 908744515 == 0) {
							local927 += (int) (Math.random() * (double) (this.aClass396_1.anInt4680 * -1520113663 + 1));
						} else {
							local927 += (int) (Math.random() * (double) (this.aClass396_1.anInt4656 * 908744515 + 1)) * (this.aClass396_1.anInt4680 * -1520113663 / (this.aClass396_1.anInt4656 * 908744515));
						}
					}
					@Pc(987) int local987 = this.aClass396_1.anInt4664 * 1082557415;
					if (this.aClass396_1.anInt4681 * -831517883 != 0) {
						local987 += (int) (Math.random() * (double) (this.aClass396_1.anInt4681 * -831517883 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass396_1.aBoolean736) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass396_1.anInt4660 * -1590427409) + local1013 * (double) (this.aClass396_1.anInt4662 * -467462389)) << 16 | (int) ((double) (this.aClass396_1.anInt4667 * 1164973449) + local1013 * (double) (this.aClass396_1.anInt4665 * 2123356127)) << 8 | (int) ((double) (this.aClass396_1.anInt4663 * -1708133081) * local1013 + (double) (this.aClass396_1.anInt4626 * 1719532367)) | (int) ((double) (this.aClass396_1.anInt4669 * 915869921) + Math.random() * (double) (this.aClass396_1.anInt4668 * 1298659105)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass396_1.anInt4660 * -1590427409) + Math.random() * (double) (this.aClass396_1.anInt4662 * -467462389)) << 16 | (int) ((double) (this.aClass396_1.anInt4667 * 1164973449) + Math.random() * (double) (this.aClass396_1.anInt4665 * 2123356127)) << 8 | (int) ((double) (this.aClass396_1.anInt4626 * 1719532367) + Math.random() * (double) (this.aClass396_1.anInt4663 * -1708133081)) | (int) ((double) (this.aClass396_1.anInt4669 * 915869921) + Math.random() * (double) (this.aClass396_1.anInt4668 * 1298659105)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass396_1.anInt4640 * 1995753329;
					if (!arg0.method20056() && !this.aClass396_1.aBoolean742) {
						local1168 = -1;
					}
					@Pc(1190) Class131_Sub2_Sub1_Sub1 local1190;
					if (Class622.anInt5631 * -1398895791 == Class622.anInt5633 * -676793059) {
						local1190 = new Class131_Sub2_Sub1_Sub1(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass396_1.aBoolean738, this.aClass396_1.aBoolean735);
					} else {
						local1190 = Class622.aClass131_Sub2_Sub1_Sub1Array1[Class622.anInt5631 * -1398895791];
						Class622.anInt5631 = (Class622.anInt5631 * -1398895791 + 1 & 0x3FF) * -1113481807;
						local1190.method23073(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass396_1.aBoolean738, this.aClass396_1.aBoolean735);
					}
					if (local303 > 256) {
						local1190.method23076(arg1, local303 >> 8);
					}
					this.anInt5582 += -969308481;
					local436++;
					local303 += local255;
				}
			}
		}
		if (!this.aClass618_1.method32384(this.aClass618_2)) {
			@Pc(1278) Class618 local1278 = this.aClass618_2;
			this.aClass618_2 = this.aClass618_1;
			this.aClass618_1 = local1278;
			this.aClass618_1.anInt5596 = this.aClass205_2.anInt3573 * 720651617;
			this.aClass618_1.anInt5597 = this.aClass205_2.anInt3580 * -1609415377;
			this.aClass618_1.anInt5601 = this.aClass205_2.anInt3574 * 1967664537;
			this.aClass618_1.anInt5599 = this.aClass205_2.anInt3575 * 644414993;
			this.aClass618_1.anInt5600 = this.aClass205_2.anInt3567 * -649875913;
			this.aClass618_1.anInt5598 = this.aClass205_2.anInt3576 * 1986510425;
			this.aClass618_1.anInt5602 = this.aClass205_2.anInt3578 * -1134895951;
			this.aClass618_1.anInt5606 = this.aClass205_2.anInt3579 * -1110900119;
			this.aClass618_1.anInt5604 = this.aClass205_2.anInt3577 * 1399265027;
			this.aClass618_1.anInt5605 = this.aClass618_2.anInt5605;
			this.aClass618_1.anInt5607 = this.aClass618_2.anInt5607;
			this.aClass618_1.anInt5603 = this.aClass618_2.anInt5603;
		}
		Class622.anInt5636 += this.anInt5582 * -1634087595;
	}

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "(Lclient!tk;Lclient!dx;J)V", line = 227)
	void method32240(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class131_Sub2_Sub1_Sub1 local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local5 != null; local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local5.method23082(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "(Lclient!tk;Lclient!dx;J)V", line = 227)
	void method32241(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class131_Sub2_Sub1_Sub1 local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local5 != null; local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local5.method23082(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "(Lclient!tk;Lclient!dx;J)V", line = 227)
	void method32242(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class131_Sub2_Sub1_Sub1 local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local5 != null; local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local5.method23082(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(Lclient!tk;Lclient!dx;J)V", line = 227)
	void method32243(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class131_Sub2_Sub1_Sub1 local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36536(); local5 != null; local5 = (Class131_Sub2_Sub1_Sub1) this.aClass703_9.method36537()) {
			local5.method23082(arg0, arg1, arg2);
		}
	}
}
