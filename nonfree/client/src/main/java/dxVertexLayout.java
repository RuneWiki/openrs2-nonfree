import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class59 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ik;[Lclient!dm;)V")
	public dxVertexLayout(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class76[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aWl1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class76 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method1468(); local23++) {
				@Pc(37) Class341 local37 = local21.method1469(local23);
				@Pc(45) byte local45;
				@Pc(49) byte local49;
				@Pc(47) int local47;
				if (local37 == Static545.aClass341_1) {
					local47 = 0;
					local49 = 0;
					local45 = 2;
				} else if (Static545.aClass341_2 == local37) {
					local45 = 2;
					local47 = 0;
					local49 = 3;
				} else if (Static545.aClass341_3 == local37) {
					local49 = 10;
					local45 = 4;
					local47 = 0;
				} else if (local37 == Static545.aClass341_4) {
					local47 = local9++;
					local45 = 0;
					local49 = 5;
				} else if (Static545.aClass341_5 == local37) {
					local45 = 1;
					local47 = local9++;
					local49 = 5;
				} else if (Static545.aClass341_6 == local37) {
					local49 = 5;
					local45 = 2;
					local47 = local9++;
				} else {
					local49 = 5;
					local47 = local9++;
					local45 = 3;
				}
				local7.addElement(local11, local45, 0, local49, local47, local17);
				local17 += local37.anInt8927;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
