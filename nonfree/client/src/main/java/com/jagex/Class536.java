package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public class Class536 {

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "[Lclient!cy;")
	static Class83[] aClass83Array9;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	static int anInt5190;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	static int anInt5189 = 0;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Z")
	boolean aBoolean788;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList4;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	final int anInt5187;

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	final int anInt5188;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "[I")
	final int[] anIntArray482;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "[I")
	final int[] anIntArray483;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Lclient!dv;")
	public Class84 aClass84_8;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "(II)Lclient!ik;", line = 13)
	public static Class324 method30822(@OriginalArg(0) int arg0) {
		if (Class324.aClass324_1.anInt4080 * -855837543 == arg0) {
			return Class324.aClass324_1;
		} else if (Class324.aClass324_2.anInt4080 * -855837543 == arg0) {
			return Class324.aClass324_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!dx;Lclient!akv;I)V", line = 27)
	public Class536(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2) {
		this.anInt5187 = arg2 * 1943401975;
		this.anInt5188 = arg1.method22535() * 612548777;
		this.anIntArray482 = new int[this.anInt5188 * -419568743];
		this.anIntArray483 = new int[this.anInt5188 * -419568743];
		@Pc(31) int local31 = arg1.method22483();
		@Pc(35) int local35 = arg1.method22483();
		for (@Pc(37) int local37 = 0; local37 < this.anInt5188 * -419568743; local37++) {
			this.anIntArray482[local37] = local31 + arg1.method22481();
			this.anIntArray483[local37] = local35 + arg1.method22481();
		}
		this.aClass84_8 = this.method30825(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "(Lclient!abz;Ljava/lang/String;ILjava/lang/Throwable;B)V", line = 36)
	public static void method30823(@OriginalArg(0) Class49 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class86.method19916(new Class582(arg0, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "(Lclient!yf;I)V", line = 37)
	static void method30824(@OriginalArg(0) Class665 arg0) {
		@Pc(16) Class303 local16 = (Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anIntArray427 == null ? 0 : local16.anIntArray427.length;
	}

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "(Lclient!dx;B)Lclient!dv;", line = 42)
	Class84 method30825(@OriginalArg(0) Class86 arg0) {
		@Pc(7) Class216 local7 = Class216.method25655(Class173.aClass478_87, this.anInt5187 * 1610177479, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3733 < 13) {
				local7.method25695(2);
			}
			return arg0.method20115(local7, 2048, anInt5189 * -688048329, 64, 768);
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(Lclient!dx;)Lclient!dv;", line = 42)
	Class84 method30826(@OriginalArg(0) Class86 arg0) {
		@Pc(7) Class216 local7 = Class216.method25655(Class173.aClass478_87, this.anInt5187 * 1610177479, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3733 < 13) {
				local7.method25695(2);
			}
			return arg0.method20115(local7, 2048, anInt5189 * -688048329, 64, 768);
		}
	}

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "(Lclient!dx;)Lclient!dv;", line = 42)
	Class84 method30827(@OriginalArg(0) Class86 arg0) {
		@Pc(7) Class216 local7 = Class216.method25655(Class173.aClass478_87, this.anInt5187 * 1610177479, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3733 < 13) {
				local7.method25695(2);
			}
			return arg0.method20115(local7, 2048, anInt5189 * -688048329, 64, 768);
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(Lclient!tk;I)V", line = 49)
	public void method30828(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.anInt5188 * -419568743 <= 0) {
			return;
		}
		this.method30835(arg0);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class104_Sub1_Sub1_Sub4 local21 = (Class104_Sub1_Sub1_Sub4) local14.next();
			arg0.method31148(local21, false);
		}
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "(Lclient!tk;)V", line = 49)
	public void method30829(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.anInt5188 * -419568743 <= 0) {
			return;
		}
		this.method30835(arg0);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class104_Sub1_Sub1_Sub4 local21 = (Class104_Sub1_Sub1_Sub4) local14.next();
			arg0.method31148(local21, false);
		}
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "(Lclient!tk;)V", line = 49)
	public void method30830(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.anInt5188 * -419568743 <= 0) {
			return;
		}
		this.method30835(arg0);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class104_Sub1_Sub1_Sub4 local21 = (Class104_Sub1_Sub1_Sub4) local14.next();
			arg0.method31148(local21, false);
		}
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(Lclient!tk;)V", line = 49)
	public void method30831(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.anInt5188 * -419568743 <= 0) {
			return;
		}
		this.method30835(arg0);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class104_Sub1_Sub1_Sub4 local21 = (Class104_Sub1_Sub1_Sub4) local14.next();
			arg0.method31148(local21, false);
		}
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "(Lclient!tk;)V", line = 49)
	public void method30832(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.anInt5188 * -419568743 <= 0) {
			return;
		}
		this.method30835(arg0);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class104_Sub1_Sub1_Sub4 local21 = (Class104_Sub1_Sub1_Sub4) local14.next();
			arg0.method31148(local21, false);
		}
		this.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "(Lclient!tk;B)V", line = 62)
	public void method30833(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class104_Sub1_Sub1_Sub4 local16 = (Class104_Sub1_Sub1_Sub4) local9.next();
			arg0.method31173(local16.aByte100, local16.aShort131, local16.aShort132, new Class530(local16));
		}
	}

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "(Lclient!tk;)V", line = 62)
	public void method30834(@OriginalArg(0) Class556 arg0) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class104_Sub1_Sub1_Sub4 local16 = (Class104_Sub1_Sub1_Sub4) local9.next();
			arg0.method31173(local16.aByte100, local16.aShort131, local16.aShort132, new Class530(local16));
		}
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "(Lclient!tk;S)V", line = 73)
	void method30835(@OriginalArg(0) Class556 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class474 local8 = client.aClass517_1.method30441();
		@Pc(12) Class595 local12 = client.aClass517_1.method30409();
		@Pc(27) Class595 local27 = new Class595(Class669.anInt5790 * -878424575, this.anIntArray482[0], this.anIntArray483[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5188 * -419568743; local29++) {
			@Pc(50) Class595 local50 = new Class595(Class669.anInt5790 * -878424575, this.anIntArray482[local29], this.anIntArray483[local29]);
			while (local27.anInt5504 * -424199969 != local50.anInt5504 * -424199969 || local50.anInt5506 * -1166289421 != local27.anInt5506 * -1166289421) {
				if (local27.anInt5504 * -424199969 < local50.anInt5504 * -424199969) {
					local27.anInt5504 += -1962245345;
				} else if (local27.anInt5504 * -424199969 > local50.anInt5504 * -424199969) {
					local27.anInt5504 -= -1962245345;
				}
				if (local27.anInt5506 * -1166289421 < local50.anInt5506 * -1166289421) {
					local27.anInt5506 += -277165253;
				} else if (local27.anInt5506 * -1166289421 > local50.anInt5506 * -1166289421) {
					local27.anInt5506 -= -277165253;
				}
				@Pc(134) int local134 = Class669.anInt5790 * -878424575;
				@Pc(144) int local144 = local27.anInt5504 * -424199969 - local12.anInt5504 * -424199969;
				@Pc(154) int local154 = local27.anInt5506 * -1166289421 - local12.anInt5506 * -1166289421;
				if (local144 >= 0 && local144 < arg0.anInt5248 * 1183912005 && local154 >= 0 && local154 < arg0.anInt5265 * 60330541) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method29665(local144, local154)) {
						local134++;
					}
					this.aLinkedList4.add(new Class104_Sub1_Sub1_Sub4(arg0, this, Class669.anInt5790 * -878424575, local134, local176, Class277.method26658(local176, local182, Class669.anInt5790 * -878424575), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "(Lclient!tk;)V", line = 73)
	void method30836(@OriginalArg(0) Class556 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class474 local8 = client.aClass517_1.method30441();
		@Pc(12) Class595 local12 = client.aClass517_1.method30409();
		@Pc(27) Class595 local27 = new Class595(Class669.anInt5790 * -878424575, this.anIntArray482[0], this.anIntArray483[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5188 * -419568743; local29++) {
			@Pc(50) Class595 local50 = new Class595(Class669.anInt5790 * -878424575, this.anIntArray482[local29], this.anIntArray483[local29]);
			while (local27.anInt5504 * -424199969 != local50.anInt5504 * -424199969 || local50.anInt5506 * -1166289421 != local27.anInt5506 * -1166289421) {
				if (local27.anInt5504 * -424199969 < local50.anInt5504 * -424199969) {
					local27.anInt5504 += -1962245345;
				} else if (local27.anInt5504 * -424199969 > local50.anInt5504 * -424199969) {
					local27.anInt5504 -= -1962245345;
				}
				if (local27.anInt5506 * -1166289421 < local50.anInt5506 * -1166289421) {
					local27.anInt5506 += -277165253;
				} else if (local27.anInt5506 * -1166289421 > local50.anInt5506 * -1166289421) {
					local27.anInt5506 -= -277165253;
				}
				@Pc(134) int local134 = Class669.anInt5790 * -878424575;
				@Pc(144) int local144 = local27.anInt5504 * -424199969 - local12.anInt5504 * -424199969;
				@Pc(154) int local154 = local27.anInt5506 * -1166289421 - local12.anInt5506 * -1166289421;
				if (local144 >= 0 && local144 < arg0.anInt5248 * 1183912005 && local154 >= 0 && local154 < arg0.anInt5265 * 60330541) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method29665(local144, local154)) {
						local134++;
					}
					this.aLinkedList4.add(new Class104_Sub1_Sub1_Sub4(arg0, this, Class669.anInt5790 * -878424575, local134, local176, Class277.method26658(local176, local182, Class669.anInt5790 * -878424575), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "(I)V", line = 99)
	public static void method30837(@OriginalArg(0) int arg0) {
		anInt5189 = arg0 * 1372860039;
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "(I)V", line = 99)
	public static void method30838(@OriginalArg(0) int arg0) {
		anInt5189 = arg0 * 1372860039;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "()V", line = 103)
	public void method30839() {
		this.aBoolean788 = false;
		this.aClass84_8 = null;
	}

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "(I)V", line = 103)
	public void method30840() {
		this.aBoolean788 = false;
		this.aClass84_8 = null;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "()Z", line = 108)
	public boolean method30841() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "(I)Z", line = 108)
	public boolean method30842() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "()Z", line = 108)
	public boolean method30843() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "()Z", line = 108)
	public boolean method30844() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "()Z", line = 108)
	public boolean method30845() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!dx;)Z", line = 112)
	public boolean method30846(@OriginalArg(0) Class86 arg0) {
		this.aClass84_8 = this.method30825(arg0);
		return this.aClass84_8 != null;
	}

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "(Lclient!dx;B)Z", line = 112)
	public boolean method30847(@OriginalArg(0) Class86 arg0) {
		this.aClass84_8 = this.method30825(arg0);
		return this.aClass84_8 != null;
	}

	@OriginalMember(owner = "client!sj", name = "ed", descriptor = "(IB)V", line = 903)
	public static void method30848(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			Class136_Sub1.anInt1708 = Class136_Sub1.anInt1701 * -1435674875;
		} else {
			Class136_Sub1.anInt1708 = arg0 * 1444927003;
		}
	}

	@OriginalMember(owner = "client!sj", name = "tf", descriptor = "(Lclient!yf;I)V", line = 7996)
	static final void method30849(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class77_Sub38 local29 = (Class77_Sub38) client.aClass12_20.method173((long) local13);
		if (local29 != null && local29.anInt3113 * 1225863589 == local23) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "ke", descriptor = "(Lclient!gm;III)V", line = 10925)
	static void method30850(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte126 == 0) {
			arg0.anInt3872 = arg0.anInt3868 * -1394902803;
		} else if (arg0.aByte126 == 1) {
			arg0.anInt3872 = ((arg1 - -881188269 * arg0.anInt3874) / 2 + arg0.anInt3868 * 646601207) * -1745491141;
		} else if (arg0.aByte126 == 2) {
			arg0.anInt3872 = (arg1 - arg0.anInt3874 * -881188269 - arg0.anInt3868 * 646601207) * -1745491141;
		} else if (arg0.aByte126 == 3) {
			arg0.anInt3872 = (arg1 * 646601207 * arg0.anInt3868 >> 14) * -1745491141;
		} else if (arg0.aByte126 == 4) {
			arg0.anInt3872 = ((arg1 * 646601207 * arg0.anInt3868 >> 14) + (arg1 - -881188269 * arg0.anInt3874) / 2) * -1745491141;
		} else {
			arg0.anInt3872 = (arg1 - arg0.anInt3874 * -881188269 - (arg1 * 646601207 * arg0.anInt3868 >> 14)) * -1745491141;
		}
		if (arg0.aByte128 == 0) {
			arg0.anInt3873 = arg0.anInt3869 * 1048318347;
		} else if (arg0.aByte128 == 1) {
			arg0.anInt3873 = (arg0.anInt3869 * -216553235 + (arg2 - arg0.anInt3875 * -1279656873) / 2) * 62926167;
		} else if (arg0.aByte128 == 2) {
			arg0.anInt3873 = (arg2 - arg0.anInt3875 * -1279656873 - arg0.anInt3869 * -216553235) * 62926167;
		} else if (arg0.aByte128 == 3) {
			arg0.anInt3873 = (arg2 * -216553235 * arg0.anInt3869 >> 14) * 62926167;
		} else if (arg0.aByte128 == 4) {
			arg0.anInt3873 = ((arg2 - arg0.anInt3875 * -1279656873) / 2 + (arg2 * arg0.anInt3869 * -216553235 >> 14)) * 62926167;
		} else {
			arg0.anInt3873 = (arg2 - arg0.anInt3875 * -1279656873 - (arg2 * -216553235 * arg0.anInt3869 >> 14)) * 62926167;
		}
		if (!client.aBoolean600 || client.method25376(arg0).anInt1558 * 1837782131 == 0 && arg0.anInt3857 * -1960530827 != 0) {
			return;
		}
		if (arg0.anInt3872 * -1196182029 < 0) {
			arg0.anInt3872 = 0;
		} else if (arg0.anInt3874 * -881188269 + arg0.anInt3872 * -1196182029 > arg1) {
			arg0.anInt3872 = (arg1 - -881188269 * arg0.anInt3874) * -1745491141;
		}
		if (arg0.anInt3873 * -612037017 < 0) {
			arg0.anInt3873 = 0;
		} else if (arg0.anInt3873 * -612037017 + arg0.anInt3875 * -1279656873 > arg2) {
			arg0.anInt3873 = (arg2 - arg0.anInt3875 * -1279656873) * 62926167;
		}
	}

	@OriginalMember(owner = "client!sj", name = "alz", descriptor = "(Lclient!yf;B)V", line = 11461)
	static final void method30851(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(21) Class447 local21 = Class447.method29120((float) local13, (float) local13, (float) local13);
		Class597.aClass107_Sub1_2.method8824(local21);
		local21.method29130();
	}

	@OriginalMember(owner = "client!sj", name = "azx", descriptor = "(Lclient!yf;B)V", line = 13697)
	static final void method30852(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26134();
	}
}
