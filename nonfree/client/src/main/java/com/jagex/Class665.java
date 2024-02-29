package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yf")
public class Class665 {

	@OriginalMember(owner = "client!yf", name = "rk", descriptor = "I")
	static int anInt5787;

	@OriginalMember(owner = "client!yf", name = "v", descriptor = "[J")
	long[] aLongArray27;

	@OriginalMember(owner = "client!yf", name = "aj", descriptor = "[I")
	int[] anIntArray535;

	@OriginalMember(owner = "client!yf", name = "k", descriptor = "Lclient!mr;")
	Class404 aClass404_1;

	@OriginalMember(owner = "client!yf", name = "u", descriptor = "Lclient!kw;")
	Class368 aClass368_3;

	@OriginalMember(owner = "client!yf", name = "o", descriptor = "Lclient!sy;")
	Interface61 anInterface61_1;

	@OriginalMember(owner = "client!yf", name = "f", descriptor = "Lclient!agh;")
	Class104_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!yf", name = "p", descriptor = "[I")
	int[] anIntArray537;

	@OriginalMember(owner = "client!yf", name = "e", descriptor = "Lclient!ajy;")
	Class77_Sub25 aClass77_Sub25_3;

	@OriginalMember(owner = "client!yf", name = "b", descriptor = "Lclient!atl;")
	Class104_Sub1_Sub5_Sub1 aClass104_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!yf", name = "h", descriptor = "I")
	int anInt5785;

	@OriginalMember(owner = "client!yf", name = "c", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray46;

	@OriginalMember(owner = "client!yf", name = "ai", descriptor = "[Lclient!rt;")
	Class520[] aClass520Array2;

	@OriginalMember(owner = "client!yf", name = "al", descriptor = "Lclient!arb;")
	Class77_Sub1_Sub9 aClass77_Sub1_Sub9_2;

	@OriginalMember(owner = "client!yf", name = "s", descriptor = "Z")
	boolean aBoolean857;

	@OriginalMember(owner = "client!yf", name = "l", descriptor = "[I")
	int[] anIntArray534 = new int[5];

	@OriginalMember(owner = "client!yf", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray64 = new int[5][5000];

	@OriginalMember(owner = "client!yf", name = "w", descriptor = "[I")
	int[] anIntArray536 = new int[1000];

	@OriginalMember(owner = "client!yf", name = "t", descriptor = "I")
	int anInt5784 = 0;

	@OriginalMember(owner = "client!yf", name = "q", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray45 = new Object[1000];

	@OriginalMember(owner = "client!yf", name = "x", descriptor = "I")
	int anInt5781 = 0;

	@OriginalMember(owner = "client!yf", name = "d", descriptor = "[J")
	long[] aLongArray28 = new long[1000];

	@OriginalMember(owner = "client!yf", name = "r", descriptor = "I")
	int anInt5782 = 0;

	@OriginalMember(owner = "client!yf", name = "g", descriptor = "I")
	int anInt5783 = 0;

	@OriginalMember(owner = "client!yf", name = "z", descriptor = "[Lclient!xv;")
	Class654[] aClass654Array1 = new Class654[50];

	@OriginalMember(owner = "client!yf", name = "j", descriptor = "Lclient!yc;")
	Class662 aClass662_2 = new Class662();

	@OriginalMember(owner = "client!yf", name = "i", descriptor = "Lclient!yc;")
	Class662 aClass662_1 = new Class662();

	@OriginalMember(owner = "client!yf", name = "n", descriptor = "Ljava/util/Map;")
	Map aMap22 = new HashMap();

	@OriginalMember(owner = "client!yf", name = "a", descriptor = "Ljava/util/Map;")
	Map aMap23 = new HashMap();

	@OriginalMember(owner = "client!yf", name = "m", descriptor = "I")
	int anInt5780 = 0;

	@OriginalMember(owner = "client!yf", name = "ag", descriptor = "I")
	int anInt5786 = 793595371;

	@OriginalMember(owner = "client!yf", name = "<init>", descriptor = "()V", line = 48)
	Class665() {
	}

	@OriginalMember(owner = "client!yf", name = "bc", descriptor = "(Lclient!dx;I)V", line = 1272)
	static void method33109(@OriginalArg(0) Class86 arg0) {
		@Pc(3) int local3 = Class624.anInt5644 * -620506573;
		@Pc(7) int local7 = Class683.anInt5836 * -260575397;
		@Pc(11) int local11 = Class639.anInt5719 * -1739196959;
		@Pc(17) int local17 = Class100_Sub1.anInt946 * -577412881 - 3;
		@Pc(19) byte local19 = 20;
		if (Class503.aClass94_11 == null || Class315.aClass17_11 == null) {
			Class503.aClass94_11 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, Class77_Sub34.anInt1749 * 1630972005, true, true);
			Class315.aClass17_11 = Class367.aClass415_1.method28644(client.anInterface51_1, Class77_Sub34.anInt1749 * 1630972005);
			if (Class503.aClass94_11 != null && Class315.aClass17_11 != null) {
				Class35_Sub17.method17430();
				@Pc(56) int local56 = local3 + local11 / 2;
				if (local11 + local56 > Class149_Sub4.anInt2368 * 1771907305) {
					local56 = Class149_Sub4.anInt2368 * 1771907305 - local11;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				Class355.method27961(local56, Class683.anInt5836 * -260575397);
				return;
			}
		}
		@Pc(87) Class94 local87;
		if (Class503.aClass94_11 == null || Class315.aClass17_11 == null) {
			local87 = Class260.aClass94_8;
		} else {
			local87 = Class503.aClass94_11;
		}
		@Pc(93) Class17 local93 = Class197.method25473();
		Class392.method28383(arg0, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local19, local87, local93, Class44.aClass44_9.method713(Class128.aClass667_3));
		@Pc(125) int local125 = 255 - Class77_Sub27.anInt3026 * -692224873 - Class683.anInt5837 * -1927425233;
		if (local125 < 0) {
			local125 = 0;
		}
		@Pc(133) int local133 = Class60.aClass138_1.method14234();
		@Pc(137) int local137 = Class60.aClass138_1.method14225();
		@Pc(141) int local141;
		@Pc(146) Class77_Sub1_Sub7 local146;
		@Pc(171) int local171;
		@Pc(246) Class77_Sub1_Sub11 local246;
		if (Class683.aBoolean862) {
			local141 = 0;
			for (local246 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local246 != null; local246 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
				local171 = Class683.anInt5819 * -238165825 * local141 + 1 + local93.anInt52 * 102396103 + local19 + local7;
				if (local133 > Class624.anInt5644 * -620506573 && local133 < Class624.anInt5644 * -620506573 + Class639.anInt5719 * -1739196959 && local137 > local171 - local93.anInt52 * 102396103 - 1 && local137 < local171 + local93.anInt51 * 728893755 && (local246.anInt3023 * -475442105 > 1 || ((Class77_Sub1_Sub7) local246.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).aBoolean490)) {
					arg0.method20088(Class624.anInt5644 * -620506573, local171 - local93.anInt52 * 102396103, Class639.anInt5719 * -1739196959, Class683.anInt5819 * -238165825, local125 << 24 | Class121.anInt1205 * 1625251985, 1);
				}
				local141++;
			}
			if (Class683.aClass77_Sub1_Sub11_1 != null) {
				Class392.method28383(arg0, Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889, local19, local87, local93, Class683.aClass77_Sub1_Sub11_1.aString107);
				local141 = 0;
				for (local146 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36335(); local146 != null; local146 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36340()) {
					local171 = Class683.anInt5819 * -238165825 * local141 + 1 + local19 + Class75.anInt224 * 892411561 + local93.anInt52 * 102396103;
					if (local133 > Class155.anInt3189 * -1803884121 && local133 < Class131_Sub3.anInt1436 * -2123561997 + Class155.anInt3189 * -1803884121 && local137 > local171 - local93.anInt52 * 102396103 - 1 && local137 < local171 + local93.anInt51 * 728893755 && local146.aBoolean490) {
						arg0.method20088(Class155.anInt3189 * -1803884121, local171 - local93.anInt52 * 102396103, Class131_Sub3.anInt1436 * -2123561997, Class683.anInt5819 * -238165825, local125 << 24 | Class121.anInt1205 * 1625251985, 1);
					}
					local141++;
				}
				Class610.method32205(arg0, Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889, local19);
			}
		} else {
			local141 = 0;
			for (local146 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local146 != null; local146 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				local171 = Class683.anInt5819 * -238165825 * (Class683.anInt5826 * 324852453 - 1 - local141) + 1 + local93.anInt52 * 102396103 + local19 + local7;
				if (local133 > Class624.anInt5644 * -620506573 && local133 < Class624.anInt5644 * -620506573 + Class639.anInt5719 * -1739196959 && local137 > local171 - local93.anInt52 * 102396103 - 1 && local137 < local93.anInt51 * 728893755 + local171 && local146.aBoolean490) {
					arg0.method20088(Class624.anInt5644 * -620506573, local171 - local93.anInt52 * 102396103, Class639.anInt5719 * -1739196959, Class683.anInt5819 * -238165825, local125 << 24 | Class121.anInt1205 * 1625251985, 1);
				}
				local141++;
			}
		}
		Class610.method32205(arg0, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local19);
		if (!Class683.aBoolean862) {
			local141 = 0;
			for (local146 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local146 != null; local146 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				local171 = local93.anInt52 * 102396103 + local19 + local7 + 1 + (Class683.anInt5826 * 324852453 - 1 - local141) * Class683.anInt5819 * -238165825;
				Class66.method953(local133, local137, local3, local7, local11, local17, local171, local146, local87, local93, Class96_Sub6.anInt826 * 1593226795 | 0xFF000000, Class489.anInt5050 * 2009199567 | 0xFF000000);
				local141++;
			}
			return;
		}
		local141 = 0;
		for (local246 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local246 != null; local246 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			local171 = Class683.anInt5819 * -238165825 * local141 + Class683.anInt5836 * -260575397 + local19 + local93.anInt52 * 102396103 + 1;
			if (local246.anInt3023 * -475442105 == 1) {
				Class66.method953(local133, local137, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local171, (Class77_Sub1_Sub7) local246.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62, local87, local93, Class96_Sub6.anInt826 * 1593226795 | 0xFF000000, Class489.anInt5050 * 2009199567 | 0xFF000000);
			} else {
				Class131_Sub3.method13095(local133, local137, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local171, local246, local87, local93, Class96_Sub6.anInt826 * 1593226795 | 0xFF000000, Class489.anInt5050 * 2009199567 | 0xFF000000);
			}
			local141++;
		}
		if (Class683.aClass77_Sub1_Sub11_1 == null) {
			return;
		}
		local141 = 0;
		for (local146 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36335(); local146 != null; local146 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36340()) {
			local171 = Class683.anInt5819 * -238165825 * local141 + Class75.anInt224 * 892411561 + local19 + local93.anInt52 * 102396103 + 1;
			Class66.method953(local133, local137, Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889, local171, local146, local87, local93, Class96_Sub6.anInt826 * 1593226795 | 0xFF000000, Class489.anInt5050 * 2009199567 | 0xFF000000);
			local141++;
		}
	}
}
