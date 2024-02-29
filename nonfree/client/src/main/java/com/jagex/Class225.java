package com.jagex;

import java.io.File;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public class Class225 {

	@OriginalMember(owner = "client!ei", name = "av", descriptor = "Ljava/io/File;")
	static File aFile1;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	int anInt3749;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	int anInt3750;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	int anInt3752;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	int anInt3753;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	final int anInt3751;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!vd;")
	final Class593 aClass593_1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!akv;)V", line = 18)
	Class225(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt3751 = arg0.method22549() * 1508553065;
		this.aClass593_1 = (Class593) Class457.method29479(Class648.method32859(), arg0.method22478());
	}

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "(IIIIB)V", line = 24)
	void method25777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class488.method29993(arg0, arg1, arg2, this.aClass593_1.anInt5502 * 403227023, this.anInt3751 * -635375911, this.aClass593_1.anInt5501 * 847393323, arg3);
		this.anInt3750 = arg0 * 123972371;
		this.anInt3752 = arg1 * -314309049;
		this.anInt3749 = arg2 * -255709329;
		this.anInt3753 = arg3 * -1844390669;
	}

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "(IIII)V", line = 24)
	void method25778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class488.method29993(arg0, arg1, arg2, this.aClass593_1.anInt5502 * 403227023, this.anInt3751 * -635375911, this.aClass593_1.anInt5501 * 847393323, arg3);
		this.anInt3750 = arg0 * 123972371;
		this.anInt3752 = arg1 * -314309049;
		this.anInt3749 = arg2 * -255709329;
		this.anInt3753 = arg3 * -1844390669;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V", line = 32)
	void method25779() {
		Class488.method29993(this.anInt3750 * -1762601189, this.anInt3752 * -836779145, this.anInt3749 * -1455419505, this.aClass593_1.anInt5502 * 403227023, -1, this.aClass593_1.anInt5501 * 847393323, this.anInt3753 * -1387240389);
	}

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "()V", line = 32)
	void method25780() {
		Class488.method29993(this.anInt3750 * -1762601189, this.anInt3752 * -836779145, this.anInt3749 * -1455419505, this.aClass593_1.anInt5502 * 403227023, -1, this.aClass593_1.anInt5501 * 847393323, this.anInt3753 * -1387240389);
	}

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "()V", line = 32)
	void method25781() {
		Class488.method29993(this.anInt3750 * -1762601189, this.anInt3752 * -836779145, this.anInt3749 * -1455419505, this.aClass593_1.anInt5502 * 403227023, -1, this.aClass593_1.anInt5501 * 847393323, this.anInt3753 * -1387240389);
	}

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "()V", line = 32)
	void method25782() {
		Class488.method29993(this.anInt3750 * -1762601189, this.anInt3752 * -836779145, this.anInt3749 * -1455419505, this.aClass593_1.anInt5502 * 403227023, -1, this.aClass593_1.anInt5501 * 847393323, this.anInt3753 * -1387240389);
	}

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "()V", line = 32)
	void method25783() {
		Class488.method29993(this.anInt3750 * -1762601189, this.anInt3752 * -836779145, this.anInt3749 * -1455419505, this.aClass593_1.anInt5502 * 403227023, -1, this.aClass593_1.anInt5501 * 847393323, this.anInt3753 * -1387240389);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()Z", line = 36)
	boolean method25784() {
		if (this.anInt3751 * -635375911 < 0) {
			return true;
		}
		@Pc(13) Class599 local13 = (Class599) Class92_Sub1.aClass35_Sub12_13.method18319(this.anInt3751 * -635375911);
		@Pc(22) boolean local22 = local13.method31995(this.aClass593_1.anInt5501 * 847393323);
		@Pc(26) int[] local26 = local13.method32023();
		if (local26 != null) {
			@Pc(31) int[] local31 = local26;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(41) int local41 = local31[local33];
				local22 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local41)).method25888();
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "(I)Z", line = 36)
	boolean method25785() {
		if (this.anInt3751 * -635375911 < 0) {
			return true;
		}
		@Pc(13) Class599 local13 = (Class599) Class92_Sub1.aClass35_Sub12_13.method18319(this.anInt3751 * -635375911);
		@Pc(22) boolean local22 = local13.method31995(this.aClass593_1.anInt5501 * 847393323);
		@Pc(26) int[] local26 = local13.method32023();
		if (local26 != null) {
			@Pc(31) int[] local31 = local26;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(41) int local41 = local31[local33];
				local22 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local41)).method25888();
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "()Z", line = 36)
	boolean method25786() {
		if (this.anInt3751 * -635375911 < 0) {
			return true;
		}
		@Pc(13) Class599 local13 = (Class599) Class92_Sub1.aClass35_Sub12_13.method18319(this.anInt3751 * -635375911);
		@Pc(22) boolean local22 = local13.method31995(this.aClass593_1.anInt5501 * 847393323);
		@Pc(26) int[] local26 = local13.method32023();
		if (local26 != null) {
			@Pc(31) int[] local31 = local26;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(41) int local41 = local31[local33];
				local22 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local41)).method25888();
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "(Lclient!dx;JIII)V", line = 337)
	public static void method25787(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20068() && arg0.method20070() > -1) {
			local9 = arg0.method20070();
			@Pc(11) Class573 local11 = null;
			if (!Class574.aLinkedList7.isEmpty()) {
				local11 = (Class573) Class574.aLinkedList7.getFirst();
			}
			if (local11 != null && local9 == local11.anInt5385 * 733600403) {
				Class574.aLinkedList7.removeFirst();
				arg0.method20014();
				@Pc(38) boolean local38 = false;
				@Pc(63) int local63;
				if (local11.aLinkedList5.isEmpty() && arg0.method20172()) {
					@Pc(54) long local54 = arg0.method20138(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517);
					local63 = Class529.aTwitchTV1.SubmitFrame(local54, arg0.method20371(), Class574.aBoolean808, arg2, arg3);
					arg0.method20074(local54);
				} else {
					arg0.method20075(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517, Class574.anIntArray501, Class574.anIntArray502);
					Class104_Sub1_Sub1_Sub1_Sub1.method19841(Class574.anIntArray501, local11.aLinkedList5, local11.anInt5386 * 1644634333, local11.anInt5384 * -1875063907, local11.aFloat313);
					local63 = Class529.aTwitchTV1.SubmitFrameRaw(Class574.anIntArray501, Class574.aBoolean808, arg2, arg3);
				}
				arg0.method20017();
				if (local63 == 2072) {
					Class574.aLong286 = arg1 * -3117649911290242775L;
				} else if (local63 == 23) {
					Class574.aLong287 = arg1 * 9074349051421350485L;
				} else if (local63 != -995 && local63 != 0) {
				}
			} else {
				arg0.method20366();
				Class574.aLinkedList7.clear();
			}
		}
		if (!Class574.aBoolean804) {
			return;
		}
		if (Class574.anIntArray501 == null) {
			Class574.anIntArray501 = new int[Class574.aBoolean808 ? arg2 * arg3 : Class508.anInt5091 * 1445010517 * -777198511 * Class398.anInt4682];
			Class574.anIntArray502 = new int[Class574.aBoolean808 ? arg3 * arg2 : Class398.anInt4682 * -777198511 * Class508.anInt5091 * 1445010517];
		}
		if (arg0.method20068()) {
			arg0.method20072(client.anInt3414, Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517);
			Class574.aLinkedList7.add(new Class573(client.anInt3414, Class574.aLinkedList6, arg0.anInt2792 * -1555714981, arg0.anInt2793 * -385311879, arg0.aFloat191));
			Class574.aLinkedList6 = new LinkedList();
		} else {
			arg0.method20014();
			arg0.method20075(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517, Class574.anIntArray501, Class574.anIntArray502);
			Class104_Sub1_Sub1_Sub1_Sub1.method19841(Class574.anIntArray501, Class574.aLinkedList6, arg0.anInt2792 * -1555714981, arg0.anInt2793 * -385311879, arg0.aFloat191);
			local9 = Class529.aTwitchTV1.SubmitFrameRaw(Class574.anIntArray501, Class574.aBoolean808, arg2, arg3);
			arg0.method20017();
			Class574.aLinkedList6.clear();
			if (local9 == 2072) {
				Class574.aLong286 = arg1 * -3117649911290242775L;
			} else if (local9 == 23) {
				Class574.aLong287 = arg1 * 9074349051421350485L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		Class574.aBoolean804 = false;
	}

	@OriginalMember(owner = "client!ei", name = "cf", descriptor = "(Lclient!yf;B)V", line = 4859)
	static final void method25788(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class350.method27882(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "di", descriptor = "(Lclient!yf;B)V", line = 5093)
	static final void method25789(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class192.method25435(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "agw", descriptor = "(Lclient!yf;I)V", line = 10607)
	static final void method25790(@OriginalArg(0) Class665 arg0) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!ei", name = "awq", descriptor = "(Lclient!yf;I)V", line = 13256)
	static final void method25791(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method16264(local12);
	}
}
