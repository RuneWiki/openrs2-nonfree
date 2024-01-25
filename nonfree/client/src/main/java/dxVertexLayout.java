import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class199 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!gaa;[Lclient!eda;)V")
	public dxVertexLayout(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class89[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anAm1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class89 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method1693(); local27++) {
				@Pc(37) Class181 local37 = local25.method1692(local27);
				@Pc(49) byte local49;
				@Pc(47) byte local47;
				@Pc(45) int local45;
				if (Static263.aClass181_1 == local37) {
					local49 = 2;
					local47 = 0;
					local45 = 0;
				} else if (Static263.aClass181_2 == local37) {
					local45 = 0;
					local47 = 3;
					local49 = 2;
				} else if (Static263.aClass181_3 == local37) {
					local45 = 0;
					local47 = 10;
					local49 = 4;
				} else if (local37 == Static263.aClass181_4) {
					local49 = 0;
					local45 = local9++;
					local47 = 5;
				} else if (local37 == Static263.aClass181_5) {
					local47 = 5;
					local45 = local9++;
					local49 = 1;
				} else if (local37 == Static263.aClass181_6) {
					local47 = 5;
					local49 = 2;
					local45 = local9++;
				} else {
					local47 = 5;
					local49 = 3;
					local45 = local9++;
				}
				local7.addElement(local11, local49, 0, local47, local45, local21);
				local21 += local37.anInt4836;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
