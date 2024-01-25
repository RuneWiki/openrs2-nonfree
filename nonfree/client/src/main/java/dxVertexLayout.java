import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class321 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ss;[Lclient!ca;)V")
	public dxVertexLayout(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class43[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aBea1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class43 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method801(); local23++) {
				@Pc(37) Class79 local37 = local21.method804(local23);
				@Pc(47) byte local47;
				@Pc(49) byte local49;
				@Pc(45) int local45;
				if (local37 == Static108.aClass79_1) {
					local49 = 0;
					local47 = 2;
					local45 = 0;
				} else if (local37 == Static108.aClass79_2) {
					local45 = 0;
					local47 = 2;
					local49 = 3;
				} else if (Static108.aClass79_3 == local37) {
					local49 = 10;
					local45 = 0;
					local47 = 4;
				} else if (Static108.aClass79_4 == local37) {
					local47 = 0;
					local45 = local9++;
					local49 = 5;
				} else if (local37 == Static108.aClass79_5) {
					local45 = local9++;
					local49 = 5;
					local47 = 1;
				} else if (local37 == Static108.aClass79_6) {
					local49 = 5;
					local47 = 2;
					local45 = local9++;
				} else {
					local47 = 3;
					local49 = 5;
					local45 = local9++;
				}
				local7.addElement(local11, local47, 0, local49, local45, local17);
				local17 += local37.anInt2606;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
