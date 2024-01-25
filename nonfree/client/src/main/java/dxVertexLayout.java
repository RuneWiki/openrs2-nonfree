import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class310 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "i", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hg;[Lclient!jp;)V")
	public dxVertexLayout(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class154[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aPe1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class154 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method4177(); local23++) {
				@Pc(37) Class313 local37 = local21.method4176(local23);
				@Pc(49) byte local49;
				@Pc(45) byte local45;
				@Pc(47) int local47;
				if (Static525.aClass313_1 == local37) {
					local49 = 2;
					local45 = 0;
					local47 = 0;
				} else if (local37 == Static525.aClass313_2) {
					local45 = 3;
					local47 = 0;
					local49 = 2;
				} else if (local37 == Static525.aClass313_3) {
					local45 = 10;
					local49 = 4;
					local47 = 0;
				} else if (Static525.aClass313_4 == local37) {
					local47 = local9++;
					local49 = 0;
					local45 = 5;
				} else if (Static525.aClass313_5 == local37) {
					local45 = 5;
					local47 = local9++;
					local49 = 1;
				} else if (Static525.aClass313_6 == local37) {
					local49 = 2;
					local45 = 5;
					local47 = local9++;
				} else {
					local47 = local9++;
					local45 = 5;
					local49 = 3;
				}
				local7.addElement(local11, local49, 0, local45, local47, local17);
				local17 += local37.anInt9283;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
