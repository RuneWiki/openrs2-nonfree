package com.jagex;

import jaclib.ping.Ping;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public class Class487 {

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "[Lclient!acg;")
	static Class57[] aClass57Array1;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	static int anInt5150 = 0;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	static int anInt5151 = 0;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(Ljava/awt/Component;ZI)Lclient!uj;", line = 12)
	public static Class153 method29814(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 66)
	Class487() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "()I", line = 71)
	public static int method29808() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "()I", line = 71)
	public static int method29809() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "()I", line = 71)
	public static int method29810() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()I", line = 71)
	public static int method29811() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "()I", line = 71)
	public static int method29812() {
		if (anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (anInt5150 * -303781075 == 1) {
			aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < aClass57Array1.length; local258++) {
				if (aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			anInt5151 = local258 * -1420497609;
			anInt5150 = 1625274698;
		}
		if (aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			aClass57Array1 = null;
		}
		local258 -= anInt5151 * -1498130297;
		local321 -= anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "(IIB)I", line = 160)
	public static int method29815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "()V", line = 165)
	public static void method29807() {
		anInt5150 = 0;
		anInt5151 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "()V", line = 165)
	public static void method29813() {
		anInt5150 = 0;
		anInt5151 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "ie", descriptor = "(IIIIIIB)V", line = 5625)
	static final void method29817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 == 2) {
				Class166_Sub11.method15594(local11.anInt3251 * -1373605449, local11.anInt3248 * 846615897, local11.anInt3249 * 166908561, 0, local11.anInt3244 * 1880035118, false, false);
				if (client.aFloatArray93[0] > -1.0F && client.anInt3485 % 20 < 10) {
					@Pc(60) Class100 local60 = Class707.aClass100Array9[local11.anInt3253 * -2053428357];
					@Pc(70) int local70 = (int) (client.aFloatArray93[0] + (float) arg0 - 12.0F);
					@Pc(80) int local80 = (int) (client.aFloatArray93[1] + (float) arg1 - 28.0F);
					local60.method18169(local70, local80);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "in", descriptor = "(Lclient!ahm;Lclient!ahm;IIIIIIIB)V", line = 6201)
	static final void method29818(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class132_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg1.method19950();
		if (local3 == -1) {
			return;
		}
		@Pc(15) Class100 local15 = (Class100) client.aClass240_66.method25839((long) local3);
		if (local15 == null) {
			@Pc(22) Class105[] local22 = Class203.method24651(Class110_Sub7.aClass497_22, local3, 0);
			if (local22 == null) {
				return;
			}
			local15 = Class694.aClass104_14.method20499(local22[0], true);
			client.aClass240_66.method25830(local15, (long) local3);
		}
		@Pc(41) Class472 local41 = arg0.method24229().aClass472_61;
		Class166_Sub11.method15594(arg0.aByte100, (int) local41.aFloat317, (int) local41.aFloat319, arg0.method19997() * 256, 0, false, false);
		@Pc(69) int local69 = (int) (client.aFloatArray93[0] + (float) arg3 - 18.0F);
		@Pc(81) int local81 = (int) ((float) arg4 + client.aFloatArray93[1] - 16.0F - 54.0F);
		@Pc(89) int local89 = local69 + arg2 / 4 * 18;
		@Pc(97) int local97 = local81 + arg2 % 4 * 18;
		local15.method18169(local89, local97);
		if (arg1 == arg0) {
			Class694.aClass104_14.method20472(local89 - 1, local97 - 1, 18, 18, -256);
		}
		@Pc(119) Class149_Sub5 local119 = Class19.method23635();
		local119.aClass132_Sub1_Sub1_Sub1_1 = arg1;
		local119.anInt1449 = local89 * -1551293887;
		local119.anInt1447 = local97 * 897555083;
		local119.anInt1450 = (local89 + 16) * 670779561;
		local119.anInt1451 = (local97 + 16) * 470085231;
		client.aClass21_7.method379(local119);
	}

	@OriginalMember(owner = "client!pm", name = "xf", descriptor = "(Lclient!yf;I)V", line = 9237)
	static final void method29816(@OriginalArg(0) Class681 arg0) {
		if (client.anInt3514 * 2055688893 >= 2) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3514 * 2055688893;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "asj", descriptor = "(Lclient!yf;S)V", line = 13159)
	static final void method29819(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, local13);
		if (!local28) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 0);
		}
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}
}
